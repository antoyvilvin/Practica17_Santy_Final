/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santy_p17;

import java.util.Scanner;

public class Santy_p17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        float euros1;
        int cash;
        String euros;

        //7
        char letra;
        int letra2;

        int option = -1;

        while (option != 8) {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {//switch inicio
                case 1:
                    System.out.println("How much money in euros?: ");
                    cash = keyboard.nextInt();
                    float cas1 = p1(cash);
                    System.out.println(cas1);
                    break;

                case 2:
                    System.out.println("How much money in euros?: ");
                    cash = keyboard.nextInt();
                    double cas2 = p2(cash);
                    System.out.println(cas2);
                    break;

                case 3:
                    System.out.println("How much money in euros?: ");
                    cash = keyboard.nextInt();
                    String cas3 = p3(cash);
                    System.out.println(cas3);
                    break;

                case 4:
                    System.out.println("How much money in euros?: ");
                    euros = keyboard.next();
                    int cas4 = p4(euros);
                    System.out.println(cas4);
                    break;

                case 5:
                    System.out.println("How much money in euros?: ");
                    euros1 = keyboard.nextInt();
                    int cas5 = p5(euros1);
                    System.out.println(cas5);
                    break;

                case 6:
                    System.out.println("How much money in euros?: ");
                    euros1 = keyboard.nextInt();
                    String cas6 = p6(euros1);
                    System.out.println(cas6);
                    break;

                case 7:
                    System.out.println("input a letter: ");
                    char dataChar = (keyboard.next()).charAt(0);

                    letra2 = (int) dataChar;

                    String cas7 = p7(letra2);
                    System.out.println(letra2);
                    System.out.println(cas7);
                    break;

                case 8:

                    System.out.println("what's your name? ");
                    String name = keyboard.next();
                    String nameBinary = functionStringToBinary(name);
                    System.out.println(nameBinary);

                    break;

                case 9:
                    System.out.println("input a letter: ");
                    int numero = keyboard.nextInt();

                    char cas9 = p9(numero);

                    System.out.println(cas9);
                    break;

                case 10:
                    for (int i = 32; i < 64; i++) {

                        String cas10;

                        cas10 = p10(i);

                        System.out.println(i + " - " + (char) i + " - " + cas10 + "\t");
                        cas10 = p10(i + 32);
                        System.out.println((i + 32) + " - " + (char) (i + 32) + " - " + cas10 + "\t");
                        cas10 = p10(i + 64);
                        System.out.println((i + 64) + " - " + (char) (i + 64) + " - " + cas10 + "\t");
                        System.out.print("");

                    }

                    break;

                default:
                    System.out.println("Option no valid, try again\n");

                case 0:
                    System.exit(0);
                    break;

            }

        }
    }

    private static void userMenu() {
        System.out.println("Option1");
        System.out.println("Option2");
        System.out.println("Option3");
        System.out.println("Option4");
        System.out.println("Option5");
        System.out.println("Option6");
        System.out.println("Option7");
        System.out.println("Option8");
        System.out.println("Option9");
        System.out.println("Option10");
        System.out.println("Salir");
        System.out.println("\nOpción?: ");
    }

    private static float p1(int coin) {
        float money;
        money = ((float) coin * 1.09f);
        return money;
    }

    private static double p2(int coin) {
        double money;
        money = ((double) coin * 1.09f);
        return money;
    }

    private static String p3(int coin) {
        float money;
        money = coin * 1.09f;
        String x = String.valueOf(money);
        return x;
    }

    private static int p4(String coin) {
        int money;
        int x = Integer.parseInt(coin);
        money = (int) (x * 1.09f);
        return money;
    }

    private static int p5(float coin) {
        int money;
        money = (int) (coin * 1.09f);
        return money;
    }

    private static String p6(float coin) {
        float money;
        money = coin * 1.09f;
        String x = String.valueOf(money);
        return x;
    }

    private static String p7(int coin) {

        String x = Integer.toBinaryString(coin);
        return x;
    }

    private static String functionStringToBinary(String txt) {

        String result = "";
        char spell;
        for (int i = 0; i < txt.length(); i++) {

            spell = txt.charAt(i);
            result += Integer.toBinaryString(spell) + " ";
        }

        return result;
    }

    private static char p9(int coin) {
        char money;
        money = (char) coin;
        return money;
    }

    private static String p10(int coin) {
        String money;

        money = Integer.toHexString(coin);
        return money;
    }

}
