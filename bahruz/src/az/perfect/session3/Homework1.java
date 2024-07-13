package az.perfect.session3;


import java.util.Scanner;

public class Homework1 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //The exercises of the String;
        //1.
        System.out.println("------Exercise 1------");

        String text = "repeat me ";
        System.out.println(text.repeat(4));
        //2.
        System.out.println("-------Exercise 2----------");
        String fruit1 = "apple", fruit2 = "banana", fruit3 = "cherry";
        char oper = ',';
        String fruit = fruit1 + fruit2 + fruit3;
        System.out.println(fruit1 + oper + fruit2 + oper + fruit3);
        //3.
        System.out.println("-------Exercise 3----------");
        String text1 = "hello World";
        System.out.println(text1.toLowerCase());
        System.out.println(text1.toUpperCase());
        //4.
        System.out.println("-------Exercise 4----------");
        String text3 = "           Hello World!!!!!!!!               ";
        System.out.println(text3.trim());
        //5.
        System.out.println("-------Exercise 5----------");
        System.out.println(fruit.replaceFirst(fruit3, "grapes"));
        //6.
        System.out.println("-------Exercise 6----------");
        String aftertext = "this is a text".substring(0, 4);
        String beforetext = "this is a text".substring(4);
        System.out.println(aftertext + beforetext.replaceAll("i", "x"));
        //6
        System.out.println("-------Exercise 6----------");
        String after = "this is a text".substring(0, 5);
        char c = 'x';
        String before = "this is a text".substring(6);
        System.out.println(after + c + before);

        //String homework
        String str1 = "one";
        String str2 = "one";
        String str3 = new String("one");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}