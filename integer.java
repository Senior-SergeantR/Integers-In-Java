package com.company;

import javax.xml.transform.Result;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class integer {

    public static void main(String[] args) {



        String a = " For i know i cannot but He can.";
        int z = 55;
        int b = 2;
        int c = 77;
        int f = 45;
        int g = -700;

        System.out.println(z + b * c / f - g);
        System.out.println(z);
        System.out.println(" mad libs ");
        System.out.println(a);

        String username = "Rabin Otieno";
        System.out.println("This is your name: " + username);

        System.out.println(" My ___ accidentally ___ed all over her new ___");

        String adjective = "flamboyant";
        String verb = "fart";
        String noun = "pogo stick";

        System.out.println(" My " + adjective + " sister accidentally " + verb + "ed all over her new " + noun + ".");

        char character;
        character = 'A';
        System.out.println(character);

        character++;
        System.out.println(character);

        character++;
        System.out.println(character);

        character++;
        System.out.println(character);

        character = 85;
        System.out.println(character);

        int i;
        for (i = 30; i <= 150; i++) {
            character = (char) i;
            System.out.println("the code is : " + i + " corresponds to : " + character);
        }


        int y;
        for (y = 50; y <= 200; y++) {
            character = (char) y;

            System.out.println("this code is:  " + y + " corresponds to : " + character);
        }

        int r;
        for (r = 40; r <= 100; r++) {
            character = (char) r;
            System.out.println("What we have is : " + r + " Comes with: " + character);

        }

        int p;
        for (p = 30; p > 20; --p) {
            String seen = " Genesis is the book of all creation ";
            System.out.println(seen + p);
        }

        System.out.println(Math.class);
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(18));
        System.out.println(Math.abs(18.2));
        System.out.println(Math.acos(.54)); // this is the arc cosine
        System.out.println(Math.addExact(79, 58)); //helps in addition
        System.out.println(Math.asin(1));  //arc sin
        System.out.println(Math.atan(-3));
        System.out.println(Math.atan2(8, 6)); //this the tangent squared
        System.out.println(Math.cbrt(64)); // this i the cubed root
        System.out.println(Math.ceil(2.3)); //helps in rounding off figures
        System.out.println(Math.copySign(4, -2)); //takes the arithmetic sign on the number on the right and places it on the left  of the other digit
        System.out.println(Math.cos(0.23)); //cos number between +1 and -1
        System.out.println(Math.cosh(-0.2));
        System.out.println(Math.decrementExact(1000)); //decreases numbers by 1
        System.out.println(Math.exp(2)); //raises the value to the written power
        System.out.println(Math.expm1(2));
        System.out.println(Math.floor(6.988));// truncates it to a whole number
        System.out.println(Math.floorDiv(5, 2)); //divides the values and truncates it to a whole number
        System.out.println(Math.floorMod(5, 2)); // gives you the modulus
        System.out.println(Math.getExponent(64));
        System.out.println(Math.hypot(3, 4));  // hypoteneus
        System.out.println(Math.IEEEremainder(5.4, 3.1));
        System.out.println(Math.incrementExact(8));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log10(30));
        System.out.println(Math.log1p(3));
        System.out.println(Math.max(98, 222));
        System.out.println(Math.min(5, 3));
        System.out.println(Math.multiplyExact(2, 3));
        System.out.println(Math.negateExact(42));
        System.out.println(Math.nextAfter(31, -5));
        System.out.println(Math.nextDown(63));
        System.out.println(Math.nextUp(53));
        System.out.println(Math.pow(3, 4)); //three is to the power of 4
        System.out.println(Math.random());
        System.out.println(Math.rint(4.3)); // helps in rounding of to the nearest whole number +
        System.out.println(Math.round(6.5021));
        System.out.println(Math.exp(2));


        //if else statements

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");


        int n = scan.nextInt();
        System.out.println(n);

        if (n >= 90 && n <= 100) {
            System.out.println("EXCELLENT A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("A");
        } else if (n >= 70 && n <= 79) {
            System.out.println("B");
        } else if (n >= 60 && n <= 69) {
            System.out.println("C");
        } else if (n >= 50 && n <= 59) {
            System.out.println("D");
        } else if (n >= 0 && n <= 49) {
            System.out.println("FAILED E");
        } else {
            System.out.println("The number you entered is not in range !!!");
        }


        // conditional operator

        int s = (7 > 3) ? 7 : 3;
        System.out.println(s);

        if (7 > 3) {
            s = 7;
        } else {
            s = 3;
        }
        System.out.println(s);

        String d = "hello";

        double result = d.equals("hello") ? 0.5 : 0.25;

        System.out.println(result);

        System.out.println("----------------------------");


        //switch case statements in java

        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Sartuday");
                break;

            default:
                System.out.println("Not a valid  day");
        }


        String dog = "plankton";

        switch (dog) {

            case "pomeranian":
                System.out.println("small dog");
                break;
            case "satin":
                System.out.println("medium dog ");
                break;
            case "plankton":
                System.out.println("quite large dog");

            default:
                System.out.println("try something different from your previous choice");

        }
        System.out.println("----------------------------");


        /////for loops in java


        System.out.println("----------------------------");

        for (int h = 0; h < 20; h++) {
            System.out.println(" alaways in the game " + h);
        }


        System.out.println("----------------------------");
        for (int h = 0; h < 15; h++) {
            System.out.println(h);
        }


        System.out.println("----------------------------");


        int[] grades = {98, 100, 83, 90, 93};

        for (int h = 0; h < grades.length; h++) {
            System.out.println(grades[h]);
        }
        System.out.println("----------------------------");


        //while loops

        int k = 0;

        while (k < 20) {
            System.out.println(a + k);
            k++;
        }


        System.out.println("----------------------------");

        // do while loops

        int l = 0;
        do {
            System.out.println(a);

        } while (l == 1);


        System.out.println("----------------------------");


        String sentence = "flap jacks are awesome";
        Scanner cans = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while (cans.hasNext()) {
            words.add(cans.next());
        }
        System.out.println(words);


        System.out.println("----------------------------");


        //Arrays


        System.out.println("Welcome to java arrays");

        String weapons[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String targets[] = {"Close-Range", "Mid-Range ", "long-Range"};

        System.out.println("THESE ARE THE WEAPONS:");

        System.out.println(weapons[1]);
        System.out.println(weapons[0]);
        System.out.println(weapons[2]);

        System.out.println("THESE ARE THE TARGETS:");

        System.out.println(targets[1]);
        System.out.println(targets[0]);
        System.out.println(targets[2]);


        //2 dimensional arrays
        
        int[][] lotteryCard = { {20, 15, 7},
                                {8, 7, 19},
                                {7, 13, 47}

        };

        int[][] lotteryCard2 = new int[3][3];

        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19; // [row ] [column]
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][1] = 47;

        System.out.println(lotteryCard[0][0]);
        System.out.println(lotteryCard[2][1]);


        System.out.println("----------------------------");
        for (int pp = 0; pp < 3; pp++) {
            System.out.println(lotteryCard[pp][pp]);

        }


        System.out.println("----------------------------");
        for (int aa = 0; aa < 3; aa++) {
            for (int bb = 0; bb < 3; bb++){

                System.out.println(lotteryCard[aa][bb]);
            }
        }

        int x[] = new int[5];
        int m[][] = new int[4][4];
        int w[][][] = new int[4][4][4];


        for (int ii=0; ii<4;ii++)
        {
             for(int j=0; j<4; j++)
             {

                 for (int kk=0; kk<4; kk++)
                 {
                    w[ii][j][kk] = ii+j+kk;
                 }
             }
        }

        for (int ii=0; ii<4;ii++)
        {
            for(int j=0; j<4; j++)
            {

                for (int kk=0; kk<4; kk++)
                {
                    System.out.println(" " + w[ii][j][kk]);
                }
            }
        }


        System.out.println("------------------------------");
        for(int ii[][] : w)
        {
            for(int j[] : ii)
            {
                for(int kk : j)
                {
                    System.out.println(" " +kk);
                }
            }
        }




//object oriented programming  OOP












    }
}