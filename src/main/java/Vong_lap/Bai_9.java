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
public class Bai_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=isInteger();
        int dem=0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                dem++;
            }
        }
        System.out.println("So uoc so cua  "+ n +" la: "+dem);
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
