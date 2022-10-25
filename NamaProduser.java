/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanza Salsabila
 */
public class NamaProduser extends Drakor{
    protected String nama_prod;
    
    public NamaProduser(String nama_prod, String nama_genre)  {
        super(nama_genre);
        this.nama_prod = nama_prod;
    }
    
    public void infoLagu (){
        System.out.println("Nama album: " + super.nama_genre);
        System.out.println("Nama Produser : " + this.nama_prod );
    }
}

