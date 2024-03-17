package com;

import java.util.Scanner;

public class bee1117 {
    public static void main(String[] args) {
        double sum=0;
        int total=0;

        Scanner sc = new Scanner(System.in);
        
        while (total!=2) {

            double marks=sc.nextDouble();
           
            if(marks>=0 && marks<=10){             
               sum+=marks;    
               total+=1;
            }

            else{
            System.out.println("nota invalida");
        
            }
            
        }
        double media=(sum/2);
        System.out.printf("media = %.2f\n",media);
        
    }
}
