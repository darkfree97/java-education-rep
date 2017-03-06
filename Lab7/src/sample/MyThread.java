package sample;


import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
    private Integer item;
    private Integer multer;
    private Integer timeline;
    private Thread parant;
    private Boolean addFlag;
    private List<Integer> valueList;
    public MyThread(Integer multer,Thread parant,Integer timeline,Boolean addFlag){
        this.multer = multer;
        this.parant = parant;
        this.timeline = timeline;
        this.addFlag = addFlag;
        this.valueList = new ArrayList<>();
    }

    public Integer getTimeline() {
        return timeline;
    }

    @Override
    public void run() {
        while (this.parant.isAlive()){
            try {
                Thread.sleep(timeline);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.addFlag){
                item = (new Random().nextInt(9)+1)*multer;
                valueList.add(0-item);
            }
            else {
                if(valueList.size()>0){
                    item = valueList.remove(0);

                }
                else {
                    this.addFlag = true;
                }
            }

        }
    }

    public Integer getItem() {
        return item;
    }

    public List<Integer> getValueList() {
        return valueList;
    }

    public Boolean getAddFlag() {
        return addFlag;
    }

    public void setAddFlag(Boolean addFlag) {
        this.addFlag = addFlag;
    }
}
