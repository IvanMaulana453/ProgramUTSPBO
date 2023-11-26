package View;

import Model.ModelSepeda;
import Node.NodeSepeda;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewSepeda {
    public void cetakAllSepeda(ArrayList<NodeSepeda> sepeda1){
        for (int i = 0; i<sepeda1.size(); i++){
            System.out.println("kode sepeda : "+sepeda1.get(i).kode_sepeda);
            System.out.println("merek sepeda : "+sepeda1.get(i).merek_sepeda);
            System.out.println("warna sepeda : "+sepeda1.get(i).warna_sepeda);
            System.out.println("stok sepeda : "+sepeda1.get(i).stok_sepeda);
            System.out.println("-----------------------------------------------------");
        }
    }

    public void insertSepeda(ModelSepeda modelSepeda){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan merek sepeda : ");
        String merek = input.nextLine();
        System.out.println("masukkan warna sepeda : ");
        String warna = input.nextLine();
        modelSepeda.insertSepeda(merek,warna);
    }

    public void cetakSepeda(ModelSepeda modelSepeda){
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan merek sepeda : ");
        String merek = input.nextLine();
        NodeSepeda sepeda = modelSepeda.searchSepeda(merek);
        if (sepeda != null) {
            System.out.println("kode sepeda : " + sepeda.kode_sepeda);
            System.out.println("merek sepeda : " + sepeda.merek_sepeda);
            System.out.println("warna sepeda : " + sepeda.warna_sepeda);
        }else{
            System.out.println("data merek tidak ditemukan");
        }
    }

    public void updateStokSepeda(ModelSepeda modelSepeda){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan merek sepeda : ");
        String merek = input.nextLine();
        System.out.println("stok buku baru : ");
        int newstok = input.nextInt();
        modelSepeda.updateStok(newstok,merek);
    }


}
