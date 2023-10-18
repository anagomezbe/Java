package com.qa;
/*
This is a block comment
It can span multiple lines
Unlike the single line comment of '//'
 */

//I prefer this
//Where I use the keystroke combo CRTl+/

/**
 * Hello world!
 *
 */// this is a public class which is a template of a type
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hi" + args[0] + "!");
        } else {
            System.out.println("Hello World!");
            System.out.println("Hello Again");
            System.out.println("Goodbye World!!!");
            System.out.println("Another line");
            String firstName = "Lisa";
//            int age = 8;
            System.out.println("Hello " + firstName);
//          allowed variable names
            char a;
            String abracadabra;
            String AbrAcAdAbRa;
            String abra_cadab_ra$;
            String abra1;
            String abra2;
            String $abra$;
            String _abra;
            String ________abra;
            {
                //    byte sizeof= 200;
                byte sizeof = 120;
                short mum = 43;
                // short hello mum;
                short hello;
                int big = sizeof * sizeof * sizeof;
                long bigger = big + big + big;
                double old = 78.0;
                //    double new = 0.1;
                double neon = 0.1;
                boolean consequence = true;
                // boolean a, b; c;
                boolean max = big > bigger;


            }
//          disallowed variable names
//          String abra#;
//          String abra-cad;
//          String abstract;
//          String 1abra;


        }
        variablesPractice();
        assignmentPractice();

    }

    public static void variablesPractice() {
        // declare the variable

        String firstName;
        //initialize the variable
        firstName = "Ana";

        int a, b, c;
        int d = 5, e = 10, f = 15;
        int g, h, i;
        g = h = i = 20;
        String lastName, city;
        String colour, food = "Pizza";
        System.out.println(food);
        colour = "Pink";
        System.out.println(colour);

        // long
        // widening conversion
        long someBigNumber = 123;
        int smallerNumber = 123;
        int smallBox;
        // narrowing conversion
        // has to be done explicitly

        smallBox = (int)someBigNumber;

        double d1 = 1.25;
        float r1 = (float)d1;

        byte b1 = 2, b2 = 3, b3 = 0;
        b3 = b1 =b2;
        

        long anotherBigNumber = 123L;
        boolean havePets = true;
        System.out.println(havePets);

        // floating point numbers
        float price = 12.99F;

        String greeting = "Helloo World\n";
        System.out.println(greeting);
        System.out.println("The End.");

    }

    public static void assignmentPractice(){
        int var1=0, var2=0;
        var1=50;
        var2 = var1 = 10;
        System.out.println(var2);

        int a, b, c;
        a = b = c = 100;
    // compound assignment
    int total = 0;
    int subtotal;
    subtotal = 8;
    //long-hand syntax
        total = total = subtotal;
    // short hand syntax
        total += subtotal;
        System.out.println(total);

        total -= subtotal;
        System.out.println(total);

        total *= 3;
        System.out.println(total);

      // Increment and decrement
        total ++;
        System.out.println(total);

        total --;
        System.out.println(total);
    }


}