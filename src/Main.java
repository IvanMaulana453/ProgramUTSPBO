import Controller.ControllerSepeda;
import Database.AllModel;
import Model.ModelSepeda;
import View.ViewSepeda;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class Main {

    static void menu_utama(){
        Scanner input = new Scanner(System.in);
        ViewSepeda viewSepeda = new ViewSepeda();
        ControllerSepeda controlSepeda = new ControllerSepeda(AllModel.sepeda1, viewSepeda);
        System.out.println("PROGRAM PERSEWAAN SEPEDA");
        System.out.println();

        int pil_menuUtama = 0;
        while (pil_menuUtama != 2){
            System.out.println("Menu Utama");
            System.out.println("1. Manajemen Sepeda");
            System.out.println("2. EXIT");
            System.out.println();
            System.out.println("masukkan pilihan anda : ");
            pil_menuUtama = input.nextInt();
            switch (pil_menuUtama){
                case 1:
                    int pil_menuBuku = 0;
                    while (pil_menuBuku != 7)
                    {
                        System.out.println("anda masuk pilihan menu Manajemen Sepeda");
                        System.out.println("");
                        System.out.println("1. Cetak semua daftar sepeda");
                        System.out.println("2. Tambah sepeda");
                        System.out.println("3. Update stok sepeda");
                        System.out.println("4. Pencarian sepeda");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("masukkan pilihan : ");
                        pil_menuBuku = input.nextInt();
                        switch (pil_menuBuku){
                            case 1:
                                System.out.println(" daftar sepeda ");
                                controlSepeda.viewAllSepeda();
                                break;
                            case 2:
                                System.out.println(" tambah sepeda ");
                                controlSepeda.insertSepeda();
                                break;
                            case 3:
                                System.out.println(" update stok sepeda ");
                                controlSepeda.updateStoSepeda();
                                break;
                            case 4:
                                System.out.println(" pencarian sepeda ");
                                controlSepeda.viewSepeda();
                                break;
                            case 5:
                                System.out.println(" kembali ke Menu Utama ");
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("- EXIT -");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!!");
            }
        }
    }
    public static void main(String[] args) {
        menu_utama();

    }
}