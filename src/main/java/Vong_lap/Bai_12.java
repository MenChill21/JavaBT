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
public class Bai_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=isInteger();
        int min=n % 10;
        int max=n % 10;
        while(n !=0 ){
            int temp=n % 10;
            if(min > temp){
                min = temp;
            }
            if(max <  temp){
                max = temp;
            }
           n/=10;
        }
        System.out.println("Min: "+min+ " Max "+max);
    }
      public static int isInteger(){
        int value=0;
        while(true){
            try{
                do{
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Nhap so nguyen N > 0: ");
                    value=Integer.parseInt(sc.nextLine());
                }while(value <= 0 );
              break;
            }catch(Exception  e){
                System.out.println("Vui long nhap dung yeu cau!");
            }
        }
        return value;
    }
}
