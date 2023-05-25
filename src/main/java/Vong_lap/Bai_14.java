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
public class Bai_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n;
        int dem=-1;
        double sum=0;
        do{
            n=input();
            sum+=n;
            dem++;
        }while(n !=0 );
        
        double kq=(sum/dem);
        System.out.printf("Trung binh cac so la %.3f ",kq);
    }
     public static double input(){
        double value=0;
        while(true){
            try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Nhap n, bam 0 de in ket qua:  ");
            value=Integer.parseInt(sc.nextLine());
              break;
            }catch(Exception  e){
                System.out.println("Vui long nhap dung yeu cau!");
            }
        }
        return value;
    }
}
