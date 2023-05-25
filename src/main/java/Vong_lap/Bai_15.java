/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vong_lap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author menhu
 */
public class Bai_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        int sld=0;
        int correct=0;
        
        while(true){
            int rd=random.nextInt(11);
            System.out.print("Nhap so ngau nhien (nhap -1) de ket thuc: ");
            int n=sc.nextInt();
            if(n==-1){
                break;
            }
            else{
               sld++;
               if(rd==n){
                   System.out.println("+1 score");
                   score++;
                   correct++;
               }else{
                   System.out.println("Sai mat roi!");
               }
            }
        }
        System.out.println("End game");
        System.out.println("So lan doan "+sld);
        System.out.println("Diem cua ban la "+score);
        if(sld>0){
            double tb=(double)correct/sld;
            System.out.printf("Trung binh doan trung la %.5f ",tb);
        }
    }
    
}
