/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vong_lap;

import java.util.Scanner;

/**
 *
 * @author menhu
 */
public class Bai_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int n = 10; n <= 99; n++){
            int num1=n % 10;
            int num2=n / 10;
            if((num1 * num2)==2*(num1 + num2)){
                System.out.println("cac so thoa dieu kiem "+n);
            }
        }
    }
}
