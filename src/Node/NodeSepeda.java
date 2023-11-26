package Node;

public class NodeSepeda {
    public int kode_sepeda;
    public String merek_sepeda;
    public int stok_sepeda;

    public String warna_sepeda;

    public NodeSepeda(int kode_sepeda, String merek_sepeda, String warna_sepeda) {
        this.kode_sepeda = kode_sepeda;
        this.merek_sepeda = merek_sepeda;
        this.warna_sepeda = warna_sepeda;
    }

    public void updateStok(int newStok){
        this.stok_sepeda = this.stok_sepeda + newStok;
    }

}
