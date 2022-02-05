package com.vektorel.entity;

public class Connection {
    // Access Modifier -> public,private
    private String Baglanti="Bursa";

    public void setBaglanti(String yenibaglanti, String yetkiiId){
        if(yetkiiId.equals("Admin")) {
            Baglanti = yenibaglanti;
        }else{
            System.out.println("Yetkisiz Erişim");
        }
    }

    public String getBaglanti(String yetkiId){
        if(yetkiId.equals("Admin"))
            return Baglanti;
        return  "";
    }
}
