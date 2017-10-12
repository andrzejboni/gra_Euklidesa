package com.company;

import java.util.Scanner;

// http://pl.spoj.com/problems/EUCGAME/

public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       int howManyGames = Integer.parseInt(input.nextLine());

       for (int i = 0; i <= howManyGames; i++)
       {
           int a = Integer.parseInt(input.next());
           int b = Integer.parseInt(input.next());

           while (a !=b ) {
                   if (a < b) {
                       b = b-a;
                   }
                   else {
                       a = a-b;
                   }
           }
           System.out.println(a+b);
       }
       }
    }


