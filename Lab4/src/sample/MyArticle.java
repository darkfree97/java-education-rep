package sample;

import java.util.Calendar;


/**
 * Created by Darkfree on 18.10.2016.
 */
public class MyArticle {
    private String product_name;
    private Integer number_of_items;
    private Double price;
    private String shop;
    private String sale_date;
    private int week_day;

    public MyArticle(String product_name, Integer number_of_items, Double price, String shop, String sale_date, int week_day) {
        this.product_name = product_name;
        this.number_of_items = (number_of_items<=0)?1:number_of_items;
        this.price = price<=0?0.01:price;
        this.shop = shop;
        this.sale_date = sale_date;
        if(week_day<7&&week_day>=0){
            this.week_day = week_day;
        }
        else {
            this.week_day = 0;
        }
    }

    public MyArticle(String product_name, Double price, String shop, String sale_date, int week_day) {
        this.product_name = product_name;
        this.number_of_items = 1;
        this.price = price;
        this.shop = shop;
        this.sale_date = sale_date;
        if(week_day<7&&week_day>=0){
            this.week_day = week_day;
        }
        else {
            this.week_day = 0;
        }
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getNumber_of_items() {
        return number_of_items;
    }

    public void setNumber_of_items(Integer number_of_items) {
        this.number_of_items = number_of_items;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public int getWeek_day() {
        return week_day;
    }

    public void setWeek_day(int week_day) {
        if(week_day<7&&week_day>=0){
            this.week_day = week_day;
        }
        else {
            this.week_day = 0;
        }
    }
}
