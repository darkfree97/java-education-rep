package com.company;

public class Main{
    public static void main(String[] args) {
        String name = "Ihor Paliy";//Ім'я
        char fav_mark = '$';//Улюблена ф-я на JS(jQuery)
        boolean f = true;
        int num_steps = 13425;
        float weight = 3.25432469f;
        byte heart_rate = 86;
        short max_height_altitude = 1743;
        long card_num = 345612340;
        double mmol = 4.4;

        System.out.println("Name: "+name);
        System.out.println("Favourite mark: "+fav_mark);
        System.out.println("Do you like green color: "+(f?"Yes":"No"));
        System.out.println("Number of steps what you do during the day: "+num_steps);
        System.out.println("The weight of my laptop: "+weight+" kg");
        System.out.println("My heart rate: "+heart_rate);
        System.out.println("The maximum altitude above sea level at which you were: "+max_height_altitude+" meters");
        System.out.println("Credit CARD namber: "+card_num);
        System.out.println("Blood sugar: "+mmol+"mmol/l");
    }
}
