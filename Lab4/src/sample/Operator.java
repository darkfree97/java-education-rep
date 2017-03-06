package sample;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Darkfree on 18.10.2016.
 */
public class Operator {
    private ArrayList<MyArticle> list;
    private Check check;

    public Operator(ArrayList<MyArticle> list) {
        this.list = list;
        check = new Check(list);
    }


    public void showList(){
        this.check.getInfo();
    }


    public void top_10(){
        ArrayList<Product_number> current_list = new ArrayList<>();
        for (MyArticle article:list){
            Product_number currunt_item = new Product_number(article.getProduct_name(),article.getNumber_of_items());
            boolean f = true;
            for (Product_number product_number : current_list) {
                if(product_number.getName()==currunt_item.getName()){
                    product_number.setCount(product_number.getCount()+currunt_item.getCount());
                    f = false;
                }
            }
            if(f){
                current_list.add(currunt_item);
            }
        }
        int[] arr = new int[current_list.size()];
        int j = 0;
        for (Product_number i : current_list) {
            arr[j] = i.getCount();
            j++;
        }
        Arrays.sort(arr);
        System.out.println("\n<<<<<<<<<<<<<<< TOP-10 >>>>>>>>>>>>>>>>");
        for (int k=current_list.size()-1;k>=0;k--) {
            for (Product_number i : current_list){
                boolean f = true;
                for (int i1=k+1;i1<current_list.size();i1++)
                {
                    if (arr[k] == arr[i1]) {
                        f=false;
                    }
                }
                if(arr[k]==i.getCount()&&f){
                    System.out.println(i.getName()+" - "+i.getCount());
                }
            }
        }
    }


    public int getNumberChecksByShop(String shop_name){
        int count = 0;
        ArrayList<MyArticle> l = new ArrayList<>();
        for (MyArticle item: this.list) {
            if(item.getShop()==shop_name){
                l.add(item);
                count++;
            }
        }
        Check chek = new Check(l);
        chek.getInfo();
        return count;
    }


    private ArrayList<MyArticle> check_name_search(String name){
        ArrayList<MyArticle> l = new ArrayList<>();
        for (MyArticle item : this.list) {
            if(item.getProduct_name()==name){
                l.add(item);
            }
        }
        return l;
    }

    public int getNumberChecksByProduct(String name){
        ArrayList<MyArticle> l = check_name_search(name);
        int count = l.size();
        System.out.println("\nКількість чеків продукту:\n"+name+" - "+count+" шт.");
        Check check = new Check(l);
        check.getInfo();
        return count;
    }

    public void getMiddleCheckByName(String name){
        ArrayList<MyArticle> l = check_name_search(name);
        int count = l.size();
        System.out.println("\nКількість чеків продукту:\n"+name+" - "+count+" шт.");
        Check check = new Check(l);
        check.getInfo();
    }

    private int getNumberOfSalesByShop(String shopName){
        int count = 0;
        for (MyArticle item : this.list){
            if(item.getShop()==shopName){
                count+=item.getNumber_of_items();
            }
        }
        return count;
    }

    public void getNumberOfSalesByShops(){
        System.out.println("\n<<<<<<<< Shop Top >>>>>>>>");
        ArrayList<Product_number> curl = new ArrayList<>();
        for (MyArticle item : this.list){
            Product_number currunt_item = new Product_number(item.getShop(),getNumberOfSalesByShop(item.getShop()));
            boolean f = true;
            for (Product_number product_number : curl) {
                if(product_number.getName()==currunt_item.getName()){
                    f = false;
                }
            }
            if(f){
                curl.add(currunt_item);
            }
        }
        for (Product_number item:curl){
            System.out.println(item.getName()+" - "+item.getCount());
        }
    }
    public void getNumberByWeek(String name){
        ArrayList<MyArticle> list1 = check_name_search(name);
        System.out.println("\n<<<<<<< Products Buy By Week >>>>>>>>");
        ArrayList<String> days = new ArrayList<>();
        days.add("Понеділок");
        days.add("Вівторок");
        days.add("Середа");
        days.add("Четвер");
        days.add("П'ятниця");
        days.add("Субота");
        days.add("Неділя");
        for (MyArticle item : list1){
            if(item.getWeek_day()==0){
                System.out.println(days.get(0)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==1){
                System.out.println(days.get(1)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==2){
                System.out.println(days.get(2)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==3){
                System.out.println(days.get(3)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==4){
                System.out.println(days.get(4)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==5){
                System.out.println(days.get(5)+" - "+item.getNumber_of_items());
            }
            if(item.getWeek_day()==6){
                System.out.println(days.get(6)+" - "+item.getNumber_of_items());
            }

        }

    }
    public void getProductByDate(String date){
        ArrayList<MyArticle> l = new ArrayList<>();
        for (MyArticle item : this.list) {
            if(item.getSale_date()==date){
                l.add(item);
            }
        }
        Check check = new Check(l);
        check.getInfo();
    }
}
