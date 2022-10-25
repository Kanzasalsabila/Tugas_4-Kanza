/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanza Salsabila
 */
public class JudulDrakor extends Drakor{
    protected String nama_genre;
    private java.lang.String Judul_Drakor;
    
    public JudulDrakor(String judul_drakor, String nama_genre) {
        super(nama_genre);
        this.Judul_Drakor = Judul_Drakor;
    }

    
    public void infoLagu(){
        System.out.println("Nama genre : " + super.nama_genre);
        System.out.println("Adalah judul drakor : " +this.Judul_Drakor);
    }
    
}
    
