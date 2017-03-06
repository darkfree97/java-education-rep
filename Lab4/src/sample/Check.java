package sample;

import java.util.ArrayList;

/**
 * Created by Darkfree on 18.10.2016.
 */
public class Check implements Information {
    private ArrayList<MyArticle> list;
    private ArrayList<String> days;

    public Check(ArrayList<MyArticle> list) {
        this.list = list;
        this.days = new ArrayList<>();
        this.days.add("Понеділок");
        this.days.add("Вівторок");
        this.days.add("Середа");
        this.days.add("Четвер");
        this.days.add("П'ятниця");
        this.days.add("Субота");
        this.days.add("Неділя");
    }

    @Override
    public void getInfo() {
        System.out.println("\n<<<<<<<<<<<<<Check List>>>>>>>>>>>>>>");
        for (MyArticle item : list) {
            System.out.println("Товар:        "+item.getProduct_name());
            System.out.println("Кількість:    "+item.getNumber_of_items());
            System.out.println("Ціна:         "+item.getPrice());
            System.out.println("Магазин:      "+item.getShop());
            System.out.println("Дата продажу: "+item.getSale_date());
            System.out.println("День продажу: "+this.days.get(item.getWeek_day()));
            System.out.println("--------------------------------------------------------");
        }
    }

    @Override
    public String getStringInfo(){
        return null;
    }
}
