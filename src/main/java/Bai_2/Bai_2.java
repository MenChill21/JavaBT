/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai_2;
import java.util.Scanner;
/**
 *
 * @author menhu
 */
public class Bai_2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        float toan=CheckValue("Toan");
        float van=CheckValue("Van");
        float anh=CheckValue("Anh");
        float dtb=(toan+van+anh)/3;
        if(dtb>=0 && dtb <4){
            System.out.printf("Diem tb la %,2f => loai: Yeu",dtb);
        }else if(dtb>=4 && dtb <6.5){
            System.out.printf("Diem tb la %,2f => loai: Trung binh",dtb);
        }else if(dtb>=6.5 && dtb <8){
            System.out.printf("Diem tb la %,2f => loai: Kha",dtb);
        }else{
            System.out.printf("Diem tb la %,2f => loai: Gioi",dtb);
        }
    }
     public static float CheckValue(String tm){
        float value;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.print("Nhap diem mon "+tm+ " theo thang diem 10: ");
            value=sc.nextFloat();
        }while(value < 0 || value >10);
        return value;
    }
    
}
