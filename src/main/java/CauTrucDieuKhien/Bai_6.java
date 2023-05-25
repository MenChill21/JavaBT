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
public class Bai_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int a=isInteger("1");
        int b=isInteger("2");
        double kq;
        System.out.print("Nhap vao phep toan +,-,*,/: ");
        String pt=scan.next();
        switch(pt){
            case "+" -> {
                kq=(double)a+b;
                System.out.println("Tong la: "+kq);
            }
            case "-" -> {
                kq=(double)a-b;
                System.out.println("Hieu la: "+kq);
            }
             case "*" -> {
                 kq=(double)a*b;
                 System.out.println("Tich la: "+kq);
            }
              case "/" -> {
                  if(b!=0){
                      kq=(double)a/b;
                      System.out.println("Thuong la: "+kq);
                  }else{
                      System.out.println("Mot so khong the chia cho 0 ");
                  }
            }
            default -> System.out.println("Vui long nhap dung phep tinh");
        }
        
    }
    public static int isInteger(String stt){
        int value=0;
        while(true){
            try{
                do{
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Nhap so nguyen thu "+stt+" ");
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
