/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum1;

/**
 *
 * @author Yuliana
 */
public class TugasPratikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) //untuk membuat panjang persegi yang berjumlah 4 
       {
           for(int j=0;j<=3;j++) //untuk membuat lebar persegi yang berjumlah 4 
           {
               if(i==1||i==4||j==0||j==3) //jika i berada pada baris 1 atau i berada di baris 4, maka akan mencetak mendatar.
                                         // sedangkan jika j berada di baris 0 atau j berada di baris 3 maka akan mencetak menurun
               {
                   System.out.print("@");
               }else{ //jika selain dari perintah if diatas maka baris akan dibuat kosong.
                   System.out.print(" ");
               }
           }
           System.out.println("");
       }
    }
}
    

