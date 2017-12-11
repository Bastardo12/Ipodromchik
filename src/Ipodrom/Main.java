package Ipodrom;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


        Thread Kon1 = new Thread(new Ipodrom(1, "Kobilka"));
        Thread Kon2 = new Thread(new Ipodrom(2, "Kolbaska"));
        Thread Kon3 = new Thread(new Ipodrom(3, "Mashina"));
        System.out.println("Welcome, делайте ставки и мы начинаем");
        System.out.println("Выберайте вашего коня");
        System.out.println("1.  Kobilka " +
                "2.  Kolbaska" +
                " 3.  Mashina");
       int vibor = scanner.nextInt();
       Kon1.start();
       Kon2.start();
       Kon3.start();
       System.out.println("Забег начался!");
       while (Kon1.isAlive() && Kon2.isAlive() && Kon3.isAlive()) {


       }

      int pobeditel;
       if (Kon1.isAlive()) {


           System.out.println("Winner" + " " + Kon1.getName());
           if (pobeditel == vibor) {
               System.out.println("Ставка зашла");
           } else {
               System.out.println("Вы проиграли ");
           }
       } else if (!Kon2.isAlive()) {

           System.out.println("Winner" + " " + Kon2.getName());
           if (pobeditel == vibor) {
               System.out.println("Ставка сыграла");
           } else {
               System.out.println("Вы проиграли ");
           }
       } else if (!Kon3.isAlive()) {

           System.out.println("Winner" + Kon3.getName());
           if (pobeditel == vibor) {
               System.out.println("Ставка сыграла");
           } else {
               System.out.println("Вы проиграли ");
           }
       }



       }







    }

