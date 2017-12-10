package Ipodrom;

import java.util.Random;

public class Ipodrom implements Runnable {
    Thread t;
    int time;
    String name;
    int number;

    Random r = new Random();
    public Ipodrom (int number, String name){
        this.name = name;
        this.number = number;




    }
    private int metr;
    private int milesec;

    @Override
    public void run() {
        try {
            for (int i = 1000; i > 0; i -= metr) {

                metr = 30 + (int) (Math.random() * 50);
                milesec = 300 + (int) (Math.random() * 400);
                Thread.sleep(milesec);

            }
        } catch (InterruptedException e) {
            System.out.println("Прерванный: " +name);
        }
        System.out.println("Завершенный: " + name);
    }


    }

