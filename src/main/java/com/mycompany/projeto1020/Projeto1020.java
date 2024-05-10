/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1020;
import java.util.Scanner;
public class Projeto1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dias, anos, meses;
        dias = sc.nextInt();
        anos = dias / 365;
        dias %= 365;
        meses = dias / 30;
        dias %= 30;
        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
    }
}
