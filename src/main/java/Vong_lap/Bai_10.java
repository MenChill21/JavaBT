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
public class Bai_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=isInteger();
        boolean ktra=true;
        if(n==2){
            ktra= true;
        }
        else if(n<2){
            ktra=false;
        }
        else if(n % 2 == 0){
            ktra= false;
        }
        else {
            for(int i = 3; i<(n-1); i+=2){
                if( n % i == 0){
                    ktra=false;
                    break;
                }
            }
        }
        if(ktra){
            System.out.println(n+ " la so nguyen to!");
        }else{
            System.out.println(n+ " khong phai so nguyen to!");
        }
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
