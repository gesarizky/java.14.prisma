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
public class prisma extends segitiga{
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumeprisma (){
        return luassegitiga()*Tinggi;
    }
    public double luaspermukaanprisma (){
        return 2 * luassegitiga()+(kelilingsegitiga()*Tinggi);
    }
}
