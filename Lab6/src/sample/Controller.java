package sample;

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
    private Button nLeft;

    @FXML
    private Button and;

    @FXML
    private Button or;

    @FXML
    private Button xor;

    @FXML
    private Button nRight;

    @FXML
    private Button eqv;

    @FXML
    private Button ms;

    @FXML
    private Button mc;

    @FXML
    private Button shef;

    @FXML
    private Button pirs;

    @FXML
    private Button ce;

    @FXML
    private MenuButton mem_op;

    private MenuItem wrl = new MenuItem("Set value to left operand");
    private MenuItem wrr = new MenuItem("Set value to right operand");

    private void menuRefresh(){
        mem_op.getItems().clear();
        mem_op.getItems().add(0,wrl);
        mem_op.getItems().add(1,wrr);
    }

    @FXML
    void initialize() {
        menuRefresh();
        wrl.setOnAction(event -> {

        });
        op1.setOnAction(event -> {
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
        });

        op2.setOnAction(event -> {
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
        });

        nLeft.setOnAction(event -> {
            currentMem = new Memory(opr.getNotF());
            message.setText("Result of operation of negative left operand is:\n"+currentMem.toString());
        });
        nRight.setOnAction(event -> {
            currentMem = new Memory(opr.getNotL());
            message.setText("Result of operation of negative right operand is:\n"+currentMem.toString());
        });
        and.setOnAction(event -> {
            currentMem = new Memory(opr.getAnd());
            message.setText("Result of operation of conjunction is: "+currentMem.toString());
        });
        or.setOnAction(event -> {
            currentMem = new Memory(opr.getOr());
            message.setText("Result of operation of disjunction is: "+currentMem.toString());

        });
        xor.setOnAction(event -> {
            currentMem = new Memory(opr.getXor());
            message.setText("Result of operation of exception or is: "+currentMem.toString());
        });
        shef.setOnAction(event -> {
            currentMem = new Memory(opr.getShefer());
            message.setText("Result of operation of Bar Schaeffer(NAND) is: "+currentMem.toString());
        });
        pirs.setOnAction(event -> {
            currentMem = new Memory(opr.getPirs());
            message.setText("Result of operation of Pierce Arrow  (NOR) is: "+currentMem.toString());
        });
        eqv.setOnAction(event -> {
            currentMem = new Memory(opr.getEqv());
            message.setText("Result of operation of equivalents is: "+currentMem.toString());

        });
        ms.setOnAction(event -> {
            mc.setDisable(false);
            if(currentMem.getValue()==null){
                message.setText("Nothing to save!\nYou didn't do any of operations!");
            }
            else {
                mem = currentMem;
                message.setText("Value of last operation is saved to memory!");
            }
        });
        mc.setOnAction(event -> {
            message.setText("Memory was cleared!!!");
            mc.setDisable(true);
            mem = new Memory();
        });
        ce.setOnAction(event -> {
            message.clear();
            op1.setSelected(false);
            op2.setSelected(false);
            op1.setIndeterminate(false);
            op2.setIndeterminate(false);
            op1.setText("None");
            op2.setText("None");
            opr.setVal1(new Operand(op1.getText()));
            opr.setVal2(new Operand(op2.getText()));
        });
        wrl.setOnAction(event -> {
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
                    op1.setIndeterminate(false);
                    op1.setSelected(false);
                    op1.setText(temp);
                }
                else if (temp == "True"){
                    op1.setIndeterminate(false);
                    op1.setSelected(true);
                    op1.setText(temp);
                }
                else if (temp == "False"){
                    op1.setIndeterminate(true);
                    op1.setText(temp);
                }
            }
        });
        wrr.setOnAction(event -> {
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
                    op2.setIndeterminate(false);
                    op2.setSelected(false);
                    op2.setText(temp);
                }
                else if (temp == "True"){
                    op2.setIndeterminate(false);
                    op2.setSelected(true);
                    op2.setText(temp);
                }
                else if (temp == "False"){
                    op2.setIndeterminate(true);
                    op2.setText(temp);
                }
            }
        });


    }
}
