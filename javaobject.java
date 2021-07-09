/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanotion;

/**
 *
 * @author Rifki Noviandra
 */

class barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int total = 0;
    int diskon = 0;
    int bayar = 0;
    
    barang(String nama , int hargaSatuan , int jumlah){
        this.nama = nama ;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
        
        System.out.println("Nama Barang : " + this.nama);
    }
    int hitungHargaTotal(){
        total = this.hargaSatuan * this.jumlah;
        System.out.println("Harga : " + total);
        return total;
        
    }
    int hitungDIskon(int total){
        if(total > 100000){
            diskon = total * 10/100;
            System.out.println("Diskon : " + diskon);
        }
        else if(total >= 50000 && total <= 100000){
            diskon = total * 5/100;
            System.out.println("Diskon : " + diskon);
        }
        else{
            diskon = diskon ;
            System.out.println("Diskon : " + diskon);
        }
        return diskon;
    }
    int hitungHargaBayar(int total , int diskon){
        bayar = total - diskon ;
        System.out.println("Total Pembayaran : " + bayar);
        return bayar;
    }
}
public class javaobject {
    public static void main(String[] args) {
        barang barang1 = new barang("shampoo" , 5000 , 12);
        barang1.hitungHargaTotal();
        barang1.hitungDIskon(barang1.total);
        barang1.hitungHargaBayar(barang1.total, barang1.diskon);
        
        barang barang2 = new barang("Mie" , 10000 , 12);
        barang2.hitungHargaTotal();
        barang2.hitungDIskon(barang2.total);
        barang2.hitungHargaBayar(barang2.total, barang2.diskon);
    }
}
