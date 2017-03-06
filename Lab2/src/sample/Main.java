/*
* Lab2
* by Ihor Paliy
* variant 4
* group 243(2)
* Institute of phisyics technics and computer siense
* Chair of programing software
* Subject: Programing on Java
* Teacher: Prohorov G.V.
*/


package sample;
import  java.util.Random;

public class Main {
    //Functions for test 3
    public static long factorial(int k){
        if(k==0||k==1)return 1;
        else return factorial(k-1)*k;
    }
    public static double functionB_k(int standart_x, int koeficient_k){
        return (Math.sin(Math.pow(standart_x,koeficient_k)))/((Math.pow(Math.E,2*koeficient_k))*factorial(2*koeficient_k));
    }

    //Functions for test-5
    public static double minValOfTheInterval(double firstPoint,double lastpoint){
        boolean f = true;
        double resultOfOperation = 0;
        double currentResult;
        double accuracyOfCalculation = 0.1;
        for (double x= firstPoint;x<=lastpoint;x+=accuracyOfCalculation){
            currentResult = Math.sin(x)+Math.pow(Math.cos(x),2);
            System.out.println(currentResult);
            if(f){
                resultOfOperation = currentResult;
                f=false;
            }
            if(currentResult<resultOfOperation){
                resultOfOperation = currentResult;
            }
        }
        return resultOfOperation;
    }
    public static void main(String[] args) {

        //1)Get the sum of the first 20 members
        // arithmetic progression with the first member A = 1 difference of .5 and 1 = d

//        double A = 1; // Member Of Arithmetic Progression
//        double d = 1.5; //Difference Between The Elements
//        int n = 20; //Num Of Members Of Progression
//        double res_1_formula = (2*A+d*(n-1))/2*n; //Formula
//        double res_2_cycle = 0;
//        for(int i=0;i<n;i++){// Cycle
//            res_2_cycle+=A;
//            A+=d;
//        }
//        System.out.print("Сума перших "+n+" членів прогресії(формула): "+res_1_formula+"\n");
//        System.out.print("Сума перших "+n+" членів прогресії(цикл)   : "+res_2_cycle);

        ////////////////////////////////////////////////////////////////////
        //2)A full program of study together the roots of the equation a x2 + b x + c.
        // If no roots, it should be removed text message about it.
        // Otherwise, should be withdrawn two roots.

//        double a = 1.0, b = -2.0, c = 1.0, x1 = 0, x2 = 0;// (a)x^2+(b)x+(c)=0  x1,x2 - two results
//        double d; // discriminant
//        boolean f = false; // flag
//        d = (b*b)-(4*a*c); //search discriminant of equation
//        if(d<0){ // Logic
//            f = true;
//        }
//        else {
//            d = Math.sqrt(d);
//        }
//        if(f){ //Return result
//            System.out.print("Коренів немає!!!");
//        }
//        else {
//            x1 = (0-b+d)/(2*a);
//            x2 = (0-b-d)/(2*a);
//            System.out.print((x1==x2)?"X1: "+x1:"X1: "+x1+"\nX2: "+x2);
//        }

        ////////////////////////////////////////////////////////////////////
        //3)For a given formula member number with the number k program to compute
        // the sum of all members of the series, no more than a given number of eps.

//        double esp = 1; //Exponent For Range
//        double temp_res = 0; //Current Result
//        double finalResult = 0;
//        int k = 1;
//        int x = 1;
//        while (temp_res<esp){
//            finalResult += temp_res;
//            temp_res = functionB_k(x,k);
//            k++;
//        }
//        System.out.print("Результат розрахунків: "+finalResult);

        ////////////////////////////////////////////////////////////////////
        //4)Swap the minimum and maximum elements of the array  size 10.
        Random rand = new Random();
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = rand.nextInt(20);
        }
        int point_min = 0; //Index of minimal element
        int point_max = 0; //Index of maximal element
        System.out.print("Arr: ");
        for(int i=0;i<10;i++){//Search minimal and maximal element of array
            if (arr[point_max]<arr[i]){
                point_max = i;
            }
            if (arr[point_min]>arr[i]){
                point_min = i;
            }
            System.out.print(arr[i]+" ");
        }
        int temp = arr[point_max];   //Swap
        arr[point_max] = arr[point_min];
        arr[point_min] = temp;
        System.out.print("\nResult\nArr: ");//Out of result
        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }

        ////////////////////////////////////////////////////////////////////
        //5)Find the minimum value of the function f(x)=sin(x)+cos^2(x)
        // on the interval [0, ?]

        // Look Method in top

//        System.out.print("Min value of function on interval: "+minValOfTheInterval(0,3.14));
    }
}