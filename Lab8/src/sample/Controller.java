package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import java.util.*;

public class Controller {
    private ArrayList<MyButton> btns = new ArrayList<>();
    private ParentChild pch = new ParentChild();
    private AdminDialog myDialog = new AdminDialog();
    @FXML
    private MenuItem adminMode;

    @FXML
    private MyButton lvl1_but1;

    @FXML
    private MyButton lvl2_but1;

    @FXML
    private MyButton lvl2_but2;

    @FXML
    private MyButton lvl2_but3;

    @FXML
    private MyButton lvl3_but1;

    @FXML
    private MyButton lvl3_but2;

    @FXML
    private MyButton lvl3_but3;

    @FXML
    private MyButton lvl3_but4;

    @FXML
    private MyButton lvl3_but5;

    @FXML
    private MyButton lvl3_but6;

    @FXML
    private MyButton lvl3_but7;

    @FXML
    private MyButton lvl3_but8;

    @FXML
    private MyButton lvl3_but9;

    @FXML
    private MyButton lvl4_but1;

    @FXML
    private MyButton lvl4_but2;

    @FXML
    private MyButton lvl4_but3;

    @FXML
    private MyButton lvl4_but4;

    @FXML
    private MyButton lvl4_but5;

    @FXML
    private MyButton lvl4_but6;

    @FXML
    private MyButton lvl4_but7;

    @FXML
    private MyButton lvl4_but8;

    @FXML
    private MyButton lvl4_but9;

    @FXML
    private MyButton lvl4_but11;

    @FXML
    private MyButton lvl4_but12;

    @FXML
    private MyButton lvl4_but13;

    @FXML
    private MyButton lvl4_but14;

    @FXML
    private MyButton lvl4_but15;

    @FXML
    private MyButton lvl4_but16;

    @FXML
    private MyButton lvl4_but17;

    @FXML
    private MyButton lvl4_but18;

    @FXML
    private MyButton lvl4_but19;

    @FXML
    private MyButton lvl4_but21;

    @FXML
    private MyButton lvl4_but22;

    @FXML
    private MyButton lvl4_but23;

    @FXML
    private MyButton lvl4_but24;

    @FXML
    private MyButton lvl4_but25;

    @FXML
    private MyButton lvl4_but26;

    @FXML
    private MyButton lvl4_but27;

    @FXML
    private MyButton lvl4_but28;

    @FXML
    private MyButton lvl4_but29;

    @FXML
    private Label lbl;

    @FXML
    void initialize() {
        lvl1_but1.setThreeChildren(lvl2_but1,lvl2_but2,lvl2_but3);
        lvl2_but1.setThreeChildren(lvl3_but1,lvl3_but2,lvl3_but3);
        lvl2_but2.setThreeChildren(lvl3_but4,lvl3_but5,lvl3_but6);
        lvl2_but3.setThreeChildren(lvl3_but7,lvl3_but8,lvl3_but9);
        lvl3_but1.setThreeChildren(lvl4_but1,lvl4_but2,lvl4_but3);
        lvl3_but2.setThreeChildren(lvl4_but4,lvl4_but5,lvl4_but6);
        lvl3_but3.setThreeChildren(lvl4_but7,lvl4_but8,lvl4_but9);
        lvl3_but4.setThreeChildren(lvl4_but11,lvl4_but12,lvl4_but13);
        lvl3_but5.setThreeChildren(lvl4_but14,lvl4_but15,lvl4_but16);
        lvl3_but6.setThreeChildren(lvl4_but17,lvl4_but18,lvl4_but19);
        lvl3_but7.setThreeChildren(lvl4_but21,lvl4_but22,lvl4_but23);
        lvl3_but8.setThreeChildren(lvl4_but24,lvl4_but25,lvl4_but26);
        lvl3_but9.setThreeChildren(lvl4_but27,lvl4_but28,lvl4_but29);

        lvl1_but1.setOnAction(event -> lvl1_but1.click());
        lvl2_but1.setOnAction(event -> lvl2_but1.click());
        lvl2_but2.setOnAction(event -> lvl2_but2.click());
        lvl2_but3.setOnAction(event -> lvl2_but3.click());
        lvl3_but1.setOnAction(event -> lvl3_but1.click());
        lvl3_but2.setOnAction(event -> lvl3_but2.click());
        lvl3_but3.setOnAction(event -> lvl3_but3.click());
        lvl3_but4.setOnAction(event -> lvl3_but4.click());
        lvl3_but5.setOnAction(event -> lvl3_but5.click());
        lvl3_but6.setOnAction(event -> lvl3_but6.click());
        lvl3_but7.setOnAction(event -> lvl3_but7.click());
        lvl3_but8.setOnAction(event -> lvl3_but8.click());
        lvl3_but9.setOnAction(event -> lvl3_but9.click());
        lvl4_but1.setOnAction(event -> lvl4_but1.click());
        lvl4_but2.setOnAction(event -> lvl4_but2.click());
        lvl4_but3.setOnAction(event -> lvl4_but3.click());
        lvl4_but4.setOnAction(event -> lvl4_but4.click());
        lvl4_but5.setOnAction(event -> lvl4_but5.click());
        lvl4_but6.setOnAction(event -> lvl4_but6.click());
        lvl4_but7.setOnAction(event -> lvl4_but7.click());
        lvl4_but8.setOnAction(event -> lvl4_but8.click());
        lvl4_but9.setOnAction(event -> lvl4_but9.click());
        lvl4_but11.setOnAction(event -> lvl4_but11.click());
        lvl4_but12.setOnAction(event -> lvl4_but12.click());
        lvl4_but13.setOnAction(event -> lvl4_but13.click());
        lvl4_but14.setOnAction(event -> lvl4_but14.click());
        lvl4_but15.setOnAction(event -> lvl4_but15.click());
        lvl4_but16.setOnAction(event -> lvl4_but16.click());
        lvl4_but17.setOnAction(event -> lvl4_but17.click());
        lvl4_but18.setOnAction(event -> lvl4_but18.click());
        lvl4_but19.setOnAction(event -> lvl4_but19.click());
        lvl4_but21.setOnAction(event -> lvl4_but21.click());
        lvl4_but22.setOnAction(event -> lvl4_but22.click());
        lvl4_but23.setOnAction(event -> lvl4_but23.click());
        lvl4_but24.setOnAction(event -> lvl4_but24.click());
        lvl4_but25.setOnAction(event -> lvl4_but25.click());
        lvl4_but26.setOnAction(event -> lvl4_but26.click());
        lvl4_but27.setOnAction(event -> lvl4_but27.click());
        lvl4_but28.setOnAction(event -> lvl4_but28.click());
        lvl4_but29.setOnAction(event -> lvl4_but29.click());

        myDialog.addItem(lvl1_but1.getText());
        myDialog.addItem(lvl2_but1.getText());
        myDialog.addItem(lvl2_but2.getText());
        myDialog.addItem(lvl2_but3.getText());
        myDialog.addItem(lvl3_but1.getText());
        myDialog.addItem(lvl3_but2.getText());
        myDialog.addItem(lvl3_but3.getText());
        myDialog.addItem(lvl3_but4.getText());
        myDialog.addItem(lvl3_but5.getText());
        myDialog.addItem(lvl3_but6.getText());
        myDialog.addItem(lvl3_but7.getText());
        myDialog.addItem(lvl3_but8.getText());
        myDialog.addItem(lvl3_but9.getText());
        myDialog.addItem(lvl4_but1.getText());
        myDialog.addItem(lvl4_but2.getText());
        myDialog.addItem(lvl4_but3.getText());
        myDialog.addItem(lvl4_but4.getText());
        myDialog.addItem(lvl4_but5.getText());
        myDialog.addItem(lvl4_but6.getText());
        myDialog.addItem(lvl4_but7.getText());
        myDialog.addItem(lvl4_but8.getText());
        myDialog.addItem(lvl4_but9.getText());
        myDialog.addItem(lvl4_but11.getText());
        myDialog.addItem(lvl4_but12.getText());
        myDialog.addItem(lvl4_but13.getText());
        myDialog.addItem(lvl4_but14.getText());
        myDialog.addItem(lvl4_but15.getText());
        myDialog.addItem(lvl4_but16.getText());
        myDialog.addItem(lvl4_but17.getText());
        myDialog.addItem(lvl4_but18.getText());
        myDialog.addItem(lvl4_but19.getText());
        myDialog.addItem(lvl4_but21.getText());
        myDialog.addItem(lvl4_but22.getText());
        myDialog.addItem(lvl4_but23.getText());
        myDialog.addItem(lvl4_but24.getText());
        myDialog.addItem(lvl4_but25.getText());
        myDialog.addItem(lvl4_but26.getText());
        myDialog.addItem(lvl4_but27.getText());
        myDialog.addItem(lvl4_but28.getText());
        myDialog.addItem(lvl4_but29.getText());

        adminMode.setOnAction(event -> {
            myDialog.setTitle("Admin panel");
            myDialog.setBounds(960,600,370,185);
            myDialog.setVisible(true);
            pch = myDialog.getResult();
            System.out.println(pch.toString());
            connector(this.pch);
        });

        btns.add(lvl1_but1);
        btns.add(lvl2_but1);
        btns.add(lvl2_but2);
        btns.add(lvl2_but3);
        btns.add(lvl3_but1);
        btns.add(lvl3_but2);
        btns.add(lvl3_but3);
        btns.add(lvl3_but4);
        btns.add(lvl3_but5);
        btns.add(lvl3_but6);
        btns.add(lvl3_but7);
        btns.add(lvl3_but8);
        btns.add(lvl3_but9);
        btns.add(lvl4_but1);
        btns.add(lvl4_but2);
        btns.add(lvl4_but3);
        btns.add(lvl4_but4);
        btns.add(lvl4_but5);
        btns.add(lvl4_but6);
        btns.add(lvl4_but7);
        btns.add(lvl4_but8);
        btns.add(lvl4_but9);
        btns.add(lvl4_but11);
        btns.add(lvl4_but12);
        btns.add(lvl4_but13);
        btns.add(lvl4_but14);
        btns.add(lvl4_but15);
        btns.add(lvl4_but16);
        btns.add(lvl4_but17);
        btns.add(lvl4_but18);
        btns.add(lvl4_but19);
        btns.add(lvl4_but21);
        btns.add(lvl4_but22);
        btns.add(lvl4_but23);
        btns.add(lvl4_but24);
        btns.add(lvl4_but25);
        btns.add(lvl4_but26);
        btns.add(lvl4_but27);
        btns.add(lvl4_but28);
        btns.add(lvl4_but29);

        for (MyButton item:btns){
            item.setVisible(false);
            item.setMy_lbl(lbl);
        }
        lvl1_but1.setVisible(true);
    }

    private void connector(ParentChild pch){
        MyButton tempPr = null;
        MyButton tempCh = null;
        if(pch.isAccess()){
            for (MyButton item : btns){
                if(item.getText()==pch.getParent()){
                    tempPr = item;
                }
                if(item.getText()==pch.getChild()){
                    tempCh = item;
                }
            }
            tempPr.setChild(tempCh);
            System.out.println("You set a new connection!");
        }
    }
}
