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
public class Bai_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=isInteger("1");
        int b=isInteger("2");
        int c=isInteger("3");
        int min;
        
        if(a<=b && a<=c){
            min=a;
        }else if(b<=a && b<=c){
            min=b;
        }else{
            min=c;
        }
        System.out.println("Min la: "+min);
           
    }
    public static int isInteger(String stt){
        int value=0;
        while(true){
            try{
                Scanner sc=new Scanner(System.in);
                System.out.print("Nhap so nguyen thu "+ stt+": ");
                value=Integer.parseInt(sc.nextLine());
                break;
            }catch(Exception  e){
                System.out.println("Vui long nhap vao so nguyen!");
            }
        }
        return value;
    }
    
}
