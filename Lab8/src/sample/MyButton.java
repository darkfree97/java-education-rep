package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

/**
 * Created by Darkfree on 04.12.2016.
 */
public class MyButton extends Button {
    private boolean buttonIsOpened = false;
    private Label my_lbl = null;
    ArrayList<MyButton> parents = new ArrayList<>();
    ArrayList<MyButton> children = new ArrayList<>();

    public Label getMy_lbl() {
        return my_lbl;
    }

    public void setMy_lbl(Label my_lbl) {
        this.my_lbl = my_lbl;
    }

    public void click(){
        if (!buttonIsOpened) {
            setChildrenVisible();
            setBroNotActive(true);
            my_lbl.setText(printTree(this));
        } else {
            setBroNotActive(false);
            setChildrenNotVisible();
            my_lbl.setText(printTree(this));
        }

    }
    public void setChildrenVisible(){
        for(MyButton child: children){
            child.setVisible(true);
        }
        buttonIsOpened=true;
    }
    public void setChildrenNotVisible(){
        for(MyButton child: children){
            child.setVisible(false);
            if (children!=null)child.setChildrenNotVisible();
        }
        buttonIsOpened=false;
    }
    public void setBroNotActive(boolean f){
        for(MyButton parent: parents){
            for(MyButton child: parent.getChildButtons()){
                if(child!=this){
                    child.setDisable(f);
                    child.buttonIsOpened=f;
                }
            }
        }
    }

    public ArrayList<MyButton> getChildButtons() {
        return children;
    }
    public void setChild(MyButton newChild) {
        children.add(newChild);
        newChild.setParent(this);
    }
    public void setThreeChildren(MyButton newChild1, MyButton newChild2, MyButton newChild3) {
        children.add(newChild1);
        children.add(newChild2);
        children.add(newChild3);
        newChild1.setParent(this);
        newChild2.setParent(this);
        newChild3.setParent(this);
    }

    public ArrayList<MyButton> getParentButtons() {
        return parents;
    }
    public void setParent(MyButton newParent) {
        parents.add(newParent);
    }
    public MyButton getNeededButton(String name){
        MyButton neededButton=null;
        if (this.getText().equalsIgnoreCase(name)){
            neededButton = this;
        }
        else {
            for(MyButton child: children){
                if (child.getText().equalsIgnoreCase(name)){
                    neededButton=child;
                }
            }
        }
        return neededButton;
    }
    public void showAllButtons(){
        for(MyButton child: children){
            child.setVisible(true);
            if (children!=null)child.showAllButtons();
        }
        buttonIsOpened=true;
    }
    public void hideAllButtons(){
        for(MyButton child: children){
            if (children!=null){
                child.setVisible(false);
                buttonIsOpened = false;
                child.hideAllButtons();
            }
        }
    }

    private String printTree(MyButton btn){
        if(btn.parents.size()!=0){
            return printTree(btn.getParentButtons().get(0))+" -> "+btn.getText();
        }
        else{
            return btn.getText();
        }
    }
}
