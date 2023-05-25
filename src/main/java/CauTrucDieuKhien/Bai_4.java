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
public class Bai_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=isInteger();
        if(n % 2 == 0){
            System.out.print(n+" La so chan");
        }else{
            System.out.print(n+" La so le");
        }
    }
    public static int isInteger(){
        int value=0;
        while(true){
            try{
                Scanner sc=new Scanner(System.in);
                System.out.print("Nhap so nguyen: ");
                value=Integer.parseInt(sc.nextLine());
                break;
            }catch(Exception  e){
                System.out.println("Vui long nhap vao so nguyen!");
            }
        }
        return value;
    }
    
}
