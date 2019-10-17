/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210118058Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Warna clr = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        clr.menampilkanTemplate();
        clr.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + 
        usr.namaUser.toUpperCase()+"====");
        clr.tesKepribadian(clr.namaWarna,usr.namaUser);
        
        System.out.println();
    }
    
}
