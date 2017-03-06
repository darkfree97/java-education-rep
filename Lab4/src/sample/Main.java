/*
Lab4 "Collections"
Created by Ihor Paliy
group 243
teacher Prohorov G.V.
chair PZKS by IFTKN

 */
package sample;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<MyArticle> list = new ArrayList<>();
        list.add(new MyArticle("A",2,100.0,"Магазин №1","31/12/2016",0));
        list.add(new MyArticle("F",1,100.0,"Магазин №1","31/12/2016",0));
        list.add(new MyArticle("H",4,100.0,"Магазин №1","31/12/2016",0));
        list.add(new MyArticle("R",5,100.0,"Магазин №2","31/12/2016",0));
        list.add(new MyArticle("R",97,100.0,"Магазин №2","31/12/2016",0));
        list.add(new MyArticle("N",23,100.0,"Магазин №2","31/12/2016",0));
        list.add(new MyArticle("V",34,100.0,"Магазин №3","31/12/2016",0));
        list.add(new MyArticle("X",2,100.0,"Магазин №3","31/12/2016",0));
        list.add(new MyArticle("C",1,100.0,"Магазин №3","31/12/2016",0));
        list.add(new MyArticle("I",2,100.0,"Магазин №3","31/12/2016",0));
        list.add(new MyArticle("D",24,100.0,"Магазин №3","31/12/2016",0));
        list.add(new MyArticle("D",43,100.0,"Магазин №4","31/12/2016",4));
        list.add(new MyArticle("R",2,100.0,"Магазин №4","31/12/2016",0));
        list.add(new MyArticle("V",23,100.0,"Магазин №4","31/12/2016",0));
        list.add(new MyArticle("D",6,100.0,"Магазин №4","24/12/2016",2));
        list.add(new MyArticle("D",3,100.0,"Магазин №4","24/12/2016",6));
        list.add(new MyArticle("V",9,100.0,"Магазин №5","23/12/2016",0));
        list.add(new MyArticle("Q",23,100.0,"Магазин №5","21/12/2016",0));
        list.add(new MyArticle("Q",2,100.0,"Магазин №5","26/12/2016",0));

        Operator operator = new Operator(list);
        operator.showList();
        operator.top_10();
        operator.getNumberChecksByShop("Магазин №3");
        operator.getNumberChecksByProduct("D");
        operator.getMiddleCheckByName("A");
        operator.getNumberOfSalesByShops();
        operator.getNumberByWeek("D");
        operator.getProductByDate("24/12/2016");
    }
}
