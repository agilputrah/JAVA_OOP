package sia.app.dosen.application;

import sia.app.dosen.data.Dosen;

public class Dosenapp 
{
    public static void main(String[] args) 
    {    
    Dosen dosen = new Dosen ();
    dosen.nama ="Agil";
    dosen.gender = "Laki-laki";
    dosen.setUmur(100);

    System.out.println(dosen.nama);
    System.out.println(dosen.gender);
    System.out.println(dosen.getUmur());
}
}
