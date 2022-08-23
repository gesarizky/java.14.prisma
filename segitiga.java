/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheriprisma;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class segitiga {
    public double Panjang ;
    public double Tinglas ;
    public void setPanjang(double nilaiBaru){
        this.Panjang=nilaiBaru;
    }
    public void setTinglas(double nilaiBaru){
        this.Tinglas=nilaiBaru;
    }
    public double luassegitiga(){
        return (Panjang * Tinglas)/2;
    }
    public double simir(){
        return Math.sqrt((Math.pow((Panjang/2),2)) + (Math.pow(Tinglas,2)));
    }
    public int hasilsimir(){
        return (int) simir();
    }
    public double kelilingsegitiga(){
        return Panjang + Tinglas + hasilsimir();
    }
}
