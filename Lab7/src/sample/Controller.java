package sample;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    private MyThread thread1 = new MyThread(1,Thread.currentThread(),100,true);
    private MyThread thread2 = new MyThread(10,Thread.currentThread(),250,true);
    private MyThread thread3 = new MyThread(100,Thread.currentThread(),500,true);
    private Integer suma = 0;
    private Integer item;
    private Boolean flag = true;
    @FXML
    private Button stU;

    @FXML
    private Button stT;

    @FXML
    private Button stH;

    @FXML
    private TextArea fillU;

    @FXML
    private TextArea fillT;

    @FXML
    private TextArea fillH;

    @FXML
    private TextField sumaStat;

    @FXML
    private ProgressBar statusBar;

    @FXML
    private TextArea textEdit;

    public void initialize(){
        stU.setOnAction(event -> {
            stU.setDisable(true);
            this.thread1.start();
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    while (thread1.isAlive()) {
                        Thread.sleep(thread1.getTimeline());
                        if (suma>10000){
                            thread1.setAddFlag(false);
                        }
                        else if(suma<10000){
                            thread1.setAddFlag(true);
                        }
                        item = thread1.getItem();
                        suma+=item;
                        updateMessage("" + item);
                    }
                    return null;
                }
            };
            task.messageProperty().addListener(((observable, oldValue, newValue) -> fillU.appendText(!newValue.contains("-")?newValue+"\n":"")));
            task.messageProperty().addListener(((observable, oldValue, newValue) -> textEdit.appendText(!newValue.contains("-")?"From Thread1 received - "+newValue+"\n":"From Thread1 sent "+newValue+"\n")));
            new Thread(task).start();
            this.sumUpdate();
        });
        stT.setOnAction(event -> {
            stT.setDisable(true);
            this.thread2.start();
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    while (thread2.isAlive()) {
                        Thread.sleep(thread2.getTimeline());
                        if (suma>10000){
                            thread2.setAddFlag(false);
                            thread2.wait();
                        }
                        else if(suma < 9900){
                            thread2.setAddFlag(true);
                        }
                        item = thread2.getItem();
                        suma+=item;
                        updateMessage("" + item);
                    }
                    return null;
                }
            };
            task.messageProperty().addListener(((observable, oldValue, newValue) -> fillT.appendText(!newValue.contains("-")?newValue+"\n":"")));
            task.messageProperty().addListener(((observable, oldValue, newValue) -> textEdit.appendText(!newValue.contains("-")?"From Thread2 received - "+newValue+"\n":"From Thread2 sent "+newValue+"\n")));
            new Thread(task).start();
            this.sumUpdate();
        });
        stH.setOnAction(event -> {
            stH.setDisable(true);
            this.thread3.start();
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    while (thread3.isAlive()) {
                        Thread.sleep(thread3.getTimeline());
                        if (suma>9100){
                            thread3.wait();
                        }
                        item = thread3.getItem();
                        suma+=item;
                        updateMessage("" + item);
                    }
                    return null;
                }
            };
            task.messageProperty().addListener(((observable, oldValue, newValue) -> fillH.appendText(!newValue.contains("-")?newValue+"\n":"")));
            task.messageProperty().addListener(((observable, oldValue, newValue) -> textEdit.appendText(!newValue.contains("-")?"From Thread3 received - "+newValue+"\n":"From Thread3 sent "+newValue+"\n")));
            new Thread(task).start();
            this.sumUpdate();
        });
    }
    private void sumUpdate(){
        if(this.flag){
            this.flag = false;
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    while (thread1.isAlive()||thread2.isAlive()||thread3.isAlive()) {
                        Thread.sleep(50);
                        updateMessage("" + suma);
                        updateProgress(suma,10000);
                    }
                    flag = true;
                    return null;
                }
            };
            task.messageProperty().addListener(((observable, oldValue, newValue) -> sumaStat.setText(newValue)));
            statusBar.progressProperty().bind(task.progressProperty());
            new Thread(task).start();
        }
    }
}
