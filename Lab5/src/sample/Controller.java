package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
    @FXML
    private Button ok,_show_im;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField middle;
    @FXML
    private ColorPicker my_color;
    @FXML
    private DatePicker birthd;
    @FXML
    private RadioButton chb_yes, chb_no;
    @FXML
    private TitledPane ch_games;
    @FXML
    private CheckBox ch_witcher, ch_watch, ch_FF15, ch_HM, ch_goat, ch_doom;
    @FXML
    private TextArea text;
    @FXML
    private ProgressBar status;
    @FXML
    private ImageView image;
    @FXML
    private TextField _href;
    public void initialize(){
        ok.setOnAction(event -> {
            status.setProgress(0);
            String str = my_color.getValue().toString();
            String str1="#";
            for (int i = 2; i < str.length(); i++) {
                str1+=str.substring(i,i+1);
            }
            ch_games.setExpanded(false);
            ok.setStyle("-fx-background-color: "+str1+";-fx-background-radius: 15px; -fx-border-radius: 15px; -fx-border-width: 1px; -fx-border-color: yellowgreen; ");
            text.clear();
            text.appendText("Прізвище - "+surname.getText()+"\n");
            text.appendText("Ім'я - "+name.getText()+"\n");
            text.appendText("По-Батькові - "+middle.getText()+"\n");
            text.appendText("Дата народження - "+birthd.getEditor().getText()+"\n");
            text.appendText("Колір очей - "+my_color.getValue()+"\n");
            text.appendText("Комп'ютерні ігри : ");
            boolean f = false;
            if(ch_witcher.isSelected()){
                text.appendText(ch_witcher.getText()+" ");
                f = true;
            }
            if(ch_watch.isSelected()){
                text.appendText(ch_watch.getText()+" ");
                f = true;
            }
            if(ch_HM.isSelected()){
                text.appendText(ch_HM.getText()+" ");
                f = true;
            }
            if(ch_FF15.isSelected()){
                text.appendText(ch_FF15.getText()+" ");
                f = true;
            }
            if(ch_goat.isSelected()){
                text.appendText(ch_goat.getText()+" ");
                f = true;
            }
            if(ch_doom.isSelected()){
                text.appendText(ch_doom.getText()+" ");
                f = true;
            }
            if(!f){
                text.appendText("Немає.\n");
            }
        });
        _show_im.setOnAction(event1 -> {
            image.setImage(new Image("file:"+_href.getText()));
        });


    }

}
