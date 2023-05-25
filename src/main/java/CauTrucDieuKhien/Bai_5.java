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
public class Bai_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km=isInteger();
        double tinh;
        if(km==1){
            System.out.print("Thannh tien: 15000vnd");
        }else if(km>=2 && km <=5){
            tinh=15000+((km-1) * 13500);
            System.out.print("Thannh tien: "+tinh);
        }else if(km>=6 && km <=120){
            tinh=15000+(4 * 13500)+((km-5) * 11000);
            System.out.print("Thannh tien: "+tinh);
        }else{
            //>120km giam 10%
            tinh=15000+ (4 * 13500)+ (115*11000) + ((km-120)*11000);
            System.out.print("Thannh tien: "+(tinh-(tinh*0.1))+" ban duoc giam 10%" );
        }
    }
    public static int isInteger(){
        int value=0;
        while(true){
            try{
                do{
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Nhap so km: ");
                    value=Integer.parseInt(sc.nextLine());
                }while(value <= 0 );
              break;
            }catch(Exception  e){
                System.out.println("Vui long nhap vao so km nguyen duong!");
            }
        }
        return value;
    }
}
