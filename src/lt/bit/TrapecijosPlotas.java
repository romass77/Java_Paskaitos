package lt.bit;

import java.util.Scanner;

public class TrapecijosPlotas {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Trapecijos pagrindas a");
        int trapecijosPagrindasA = sc.nextInt();

        System.out.println("Trapecijos pagrindas b");
        int trapecijosPagrindasB = sc.nextInt();

        System.out.println("Trapecijos aukstine h");
        int trpecijosAukstineH = sc.nextInt();


       // int trapecijosVidurineLinija = (trapecijosPagrindasA+trapecijosPagrindasB) / trpecijosAukstineH;
        int trapecijosPlotas =((trapecijosPagrindasA + trapecijosPagrindasB)/2)*trpecijosAukstineH;

        System.out.println("Trapecijos plotas yra = " +trapecijosPlotas);

}
    }
