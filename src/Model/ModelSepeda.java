package Model;

import Node.NodeSepeda;

import java.util.ArrayList;

public class ModelSepeda {
    public ArrayList<NodeSepeda> sepeda1;
    private int kode_update = -1;
    public ModelSepeda(){
        this.sepeda1 = new ArrayList<>();
    }

    public void insertSepeda(String merek, String warna_sepeda){
        this.kode_update++;
        this.sepeda1.add(new NodeSepeda(this.kode_update, merek, warna_sepeda));
    }

    public ArrayList<NodeSepeda> viewSepeda(){
        return sepeda1;
    }

    public void updateStok(int newstok, String merek){
        NodeSepeda sepeda = searchSepeda(merek);
        sepeda.updateStok(newstok);
    }

    public NodeSepeda searchSepeda(String merek){
        NodeSepeda sepeda = null;
        for (int i = 0; i<sepeda1.size(); i++){
            if (merek.equals(sepeda1.get(i).merek_sepeda)){
                sepeda = sepeda1.get(i);
            }
        }
        return sepeda;
    }

}
