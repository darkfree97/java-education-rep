package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {
    List<String> list = new ArrayList<>();

    @FXML
    private TextArea textEdit;

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem closeFile;

    @FXML
    private MenuItem getInfo;

    @FXML
    private TextField lineSearch;

    @FXML
    private TextField lineShow;

    @FXML
    private Button findButton;

    @FXML
    void initialize() {
        closeFile.setVisible(false);
        openFile.setOnAction(event -> {
            open_file();
            read_file();
            out();
        });
        closeFile.setOnAction(event -> {
            textEdit.clear();
        });
        findButton.setOnAction(event -> {
            String search = lineSearch.getText();
            Boolean f = Pattern.matches("^[+]380\\d{9}$|^[+]1\\d{10}$",search);
            if(!f){
                JOptionPane.showMessageDialog(null,"Введено невірний формат номеру!","Повідомлення",2);
            }
            else {
                boolean flag = true;
                for (String line : list){
                    if(line.contains(search)){
                        Integer point = line.indexOf("-");
                        lineShow.setText(line.substring(point+2));
                        flag = false;
                    }
                }
                if (flag){
                    JOptionPane.showMessageDialog(null,"Даного номеру не існує у вашій телефонній книзі!\n" +
                            "Або ви не відкрили телефонну книгу!","Повідомлення",2);
                }
            }
        });
        lineSearch.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                Boolean f = Pattern.matches("^[+]380\\d{9}$|^[+]1\\d{10}$",lineSearch.getText());
                if (f){
                    findButton.setDisable(false);
                    lineSearch.setStyle("-fx-text-fill: green");
                }
                else {
                    findButton.setDisable(true);
                    lineSearch.setStyle("-fx-text-fill: darkred");
                }
            }
        });
        getInfo.setOnAction(event -> {
            JOptionPane.showMessageDialog(null,"Це телефонна книга.\n" +
                    "Для її коректной роботи спочатку відкрийте файл,\n" +
                    "а потім введіть номер телефону у відповідному полі\n" +
                    "та натисніть клавішу \"Шукати\".","Інформація",1);
        });
    }
    Scanner scn;
    private void open_file(){
        try {
            scn = new Scanner(new File("res//phone_book.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Файл не знайдено","Повідомлення",0);
        }

    }
    private void read_file(){
        list.clear();
        while (scn.hasNext()){
            list.add(scn.nextLine());
        }
    }
    private void out(){
        textEdit.clear();
        for (String item : list){
            textEdit.appendText(item+"\n");
        }
    }
}
