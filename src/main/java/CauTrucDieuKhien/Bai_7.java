/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CauTrucDieuKhien;

import java.util.Scanner;

/**
 *
 * @author menhu
 */
public class Bai_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month=input();
        switch(month){
            case 1: case 3: case 5:  case 7: case 8: case 10: case 12:{
                 System.out.printf("Thang "+month+" co 31 ngay");
                 break;
            }
            case 4: case 6: case 9: case 11:{
                System.out.printf("Thang "+month+" co 30 ngay");
                 break;
            }
            case 2:{
                 Scanner sc=new Scanner(System.in);
                 System.out.print("Nhap nam : ");
                 int nam=sc.nextInt();
                 if(nam % 4==0 && nam % 100 != 0){
                     System.out.printf("Thang "+month+" co 29 ngay");
                 }else if(nam % 400 == 0){
                    System.out.printf("Thang "+month+" co 29 ngay");
                 }else{
                     System.out.printf("Thang "+month+" co 28 ngay");
                 }
                break;
            }
        }
    }
    public static int input(){
        int value=0;
        while(true){
            try{
                do{
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Nhap thang tim so ngay: ");
                    value=Integer.parseInt(sc.nextLine());
                }while(value < 1  || value >12 );
              break;
            }catch(Exception  e){
                System.out.println("Vui long nhap tu thang 1 -> 12");
            }
        }
        return value;
}}
