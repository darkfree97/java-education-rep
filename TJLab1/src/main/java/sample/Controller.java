package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller {
    private Operations opr = new Operations(new Operand("None"),new Operand("None"));
    private Memory currentMem = new  Memory();
    private Memory mem = new Memory();


    @FXML
    private CheckBox op1;

    @FXML
    private CheckBox op2;

    @FXML
    private TextArea message;

    @FXML
    private Button mc;

    @FXML
    void opClick1(ActionEvent event) {
        if(!op1.isSelected()){
            op1.setText("None");
        }
        if (op1.isIndeterminate()){
            op1.setText("False");
        }
        if (op1.isSelected()){
            op1.setText("True");
        }
        opr.setVal1(new Operand(op1.getText()));
    }

    @FXML
    void opClick2(ActionEvent event) {
        if(!op2.isSelected()){
            op2.setText("None");
        }
        if (op2.isIndeterminate()){
            op2.setText("False");
        }
        if (op2.isSelected()){
            op2.setText("True");
        }
        opr.setVal2(new Operand(op2.getText()));
    }

    @FXML
    void andClick(ActionEvent event) {
        currentMem = new Memory(opr.getAnd());
        message.setText("Result of operation of conjunction is: "+currentMem.toString());
    }

    @FXML
    void ceClick(ActionEvent event) {
        message.clear();
        op1.setSelected(false);
        op2.setSelected(false);
        op1.setIndeterminate(false);
        op2.setIndeterminate(false);
        op1.setText("None");
        op2.setText("None");
        opr.setVal1(new Operand(op1.getText()));
        opr.setVal2(new Operand(op2.getText()));
    }

    @FXML
    void eqvClick(ActionEvent event) {
        currentMem = new Memory(opr.getEqv());
        message.setText("Result of operation of equivalents is: "+currentMem.toString());
    }

    @FXML
    void mcClick(ActionEvent event) {
        message.setText("Memory was cleared!!!");
        mc.setDisable(true);
        mem = new Memory();
    }

    @FXML
    void msClick(ActionEvent event) {
        mc.setDisable(false);
        if(currentMem.getValue()==null){
            message.setText("Nothing to save!\nYou didn't do any of operations!");
        }
        else {
            mem = currentMem;
            message.setText("Value of last operation is saved to memory!");
        }
    }

    @FXML
    void nlClick(ActionEvent event) {
        currentMem = new Memory(opr.getNotF());
        message.setText("Result of operation of negative left operand is:\n"+currentMem.toString());
    }

    @FXML
    void nrClick(ActionEvent event) {
        currentMem = new Memory(opr.getNotL());
        message.setText("Result of operation of negative right operand is:\n"+currentMem.toString());
    }

    @FXML
    void orClick(ActionEvent event) {
        currentMem = new Memory(opr.getOr());
        message.setText("Result of operation of disjunction is: "+currentMem.toString());
    }

    @FXML
    void shClick(ActionEvent event) {
        currentMem = new Memory(opr.getShefer());
        message.setText("Result of operation of Bar Schaeffer(NAND) is: "+currentMem.toString());
    }

    @FXML
    void spClick(ActionEvent event) {
        currentMem = new Memory(opr.getPirs());
        message.setText("Result of operation of Pierce Arrow  (NOR) is: "+currentMem.toString());
    }

    @FXML
    void xorClick(ActionEvent event) {
        currentMem = new Memory(opr.getXor());
        message.setText("Result of operation of exception or is: "+currentMem.toString());
    }

    @FXML
    void wrlClick(ActionEvent event) {
        if(mem.getValue()==null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("file:wtf.gif"));
            alert.setTitle("Warning Dialog");
            alert.setHeaderText("Memory is free! We can't do that!");
            alert.setContentText("Be careful with the next time!");

            alert.showAndWait();
        }
        else {
            opr.setVal1(mem.getValue());
            String temp = mem.getValue().getValue();
            if (temp == "None") {
                setOp_1(false,temp);
            }
            else if (temp == "True"){
                setOp_1(true,temp);
            }
            else if (temp == "False"){
                op1.setIndeterminate(true);
                op1.setText(temp);
            }
        }
    }

    @FXML
    void wrrClick(ActionEvent event) {
        if(mem.getValue()==null){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("file:wtf.gif"));
            alert.setTitle("Warning");
            alert.setHeaderText("Memory is free! We can't do that!");
            alert.setContentText("Be careful with the next time!");

            alert.showAndWait();
        }
        else {
            opr.setVal1(mem.getValue());
            String temp = mem.getValue().getValue();
            if (temp == "None") {
                setOp_2(false,temp);
            }
            else if (temp == "True"){
                setOp_2(true,temp);
            }
            else if (temp == "False"){
                op2.setIndeterminate(true);
                op2.setText(temp);
            }
        }
    }

    private void setOp_1(boolean f,String temp){
        op1.setIndeterminate(false);
        op1.setSelected(f);
        op1.setText(temp);
    }

    private void setOp_2(boolean f,String temp){
        op2.setIndeterminate(false);
        op2.setSelected(f);
        op2.setText(temp);
    }
}
