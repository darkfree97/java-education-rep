package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Image icon = new Image("file:images.png");// Створення обєкта картинки що буде іконкою
        primaryStage.getIcons().add(icon);// Встоновлення картинки в якості іконки
//        primaryStage.getIcons().add(new Image("file:images.png")); // Скорочений варіант
        primaryStage.setTitle("Авторизація"); // Текст що виводиться в горі вікна
        primaryStage.setScene(new Scene(root)); //
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
