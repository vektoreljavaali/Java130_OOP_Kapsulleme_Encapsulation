package com.vektorel;

import com.vektorel.entity.Connection;

public class Runner {
    public static void main(String[] args) {
        Connection connection = new Connection();
        //connection.Baglanti = "İstanbul";
        connection.setBaglanti("İstanbul","Admin");
        System.out.println(connection.getBaglanti("Admin"));
    }
}
