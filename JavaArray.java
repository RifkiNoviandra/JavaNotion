/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanotion;
import java.util.Scanner;
/**
 *
 * @author Rifki Noviandra
 */
class Luas{
    int luas ;
    public int Getluas(){
        return luas;
    }
    public void setLuas(int luas){
        this.luas = luas; 
    }
}

public class JavaArray {
    
    public static void main(String[] args) {
        int lebar_tanah = 0, panjang_tanah = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Limit : ");
        int tanah = input.nextInt();
        
        Luas [] luas = new Luas[tanah];
        
        for (int i = 0; i < tanah; i++) {
            int a = i+1 ;
            System.out.println("Tanah " + a);
            System.out.print("Lebar Tanah :");
            lebar_tanah = input.nextInt();
            System.out.print("Panjang Tanah :");
            panjang_tanah = input.nextInt();
            System.out.println("");
            
            luas[i] = new Luas() ;
            luas[i].setLuas(lebar_tanah*panjang_tanah);
            
        }
        
        for (int i = 0; i < tanah; i++) {
            int a = i+1 ;
            System.out.println("Luas tanah " + a + " : " + luas[i].Getluas());
        }
    }
    
    
    
}
