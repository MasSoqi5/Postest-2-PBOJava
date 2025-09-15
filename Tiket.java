
package model;

public class Tiket {
    // === Properties (atribut) ===
    private String kodeTiket;
    private String namaPenumpang;
    private String tujuan;

    // === Constructor ===
    public Tiket(String kodeTiket, String namaPenumpang, String tujuan) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
    }

    // === Getter & Setter ===
    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    // === Menampilkan data tiket ===
    @Override
    public String toString() {
        return "Kode: " + kodeTiket + 
               ", Nama: " + namaPenumpang + 
               ", Tujuan: " + tujuan;
    }
}
