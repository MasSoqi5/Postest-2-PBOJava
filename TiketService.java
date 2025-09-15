
package Service;



import java.util.ArrayList;
import java.util.Scanner;
import model.Tiket;

public class TiketService {
    private final ArrayList<Tiket> daftarTiket = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // === Create ===
    public void tambahTiket() {
        System.out.print("Masukkan Kode Tiket: ");
        String kode = input.nextLine();
        System.out.print("Masukkan Nama Penumpang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tujuan: ");
        String tujuan = input.nextLine();

        Tiket tiket = new Tiket(kode, nama, tujuan);
        daftarTiket.add(tiket);
        System.out.println("✅ Tiket berhasil ditambahkan!\n");
    }

    // === Read ===
    public void tampilkanTiket() {
        if (daftarTiket.isEmpty()) {
            System.out.println("⚠️ Belum ada data tiket.\n");
        } else {
            System.out.println("=== Daftar Tiket ===");
            for (Tiket t : daftarTiket) {
                System.out.println(t);
            }
            System.out.println();
        }
    }

    // === Update ===
    public void updateTiket() {
        System.out.print("Masukkan kode tiket yang ingin diubah: ");
        String kode = input.nextLine();
        for (Tiket t : daftarTiket) {
            if (t.getKodeTiket().equals(kode)) {
                System.out.print("Masukkan Nama Baru: ");
                t.setNamaPenumpang(input.nextLine());
                System.out.print("Masukkan Tujuan Baru: ");
                t.setTujuan(input.nextLine());
                System.out.println("✅ Tiket berhasil diupdate!\n");
                return;
            }
        }
        System.out.println("⚠️ Tiket dengan kode tersebut tidak ditemukan.\n");
    }

    // === Delete ===
    public void hapusTiket() {
        System.out.print("Masukkan kode tiket yang ingin dihapus: ");
        String kode = input.nextLine();
        for (Tiket t : daftarTiket) {
            if (t.getKodeTiket().equals(kode)) {
                daftarTiket.remove(t);
                System.out.println("✅ Tiket berhasil dihapus!\n");
                return;
            }
        }
        System.out.println("⚠️ Tiket tidak ditemukan.\n");
    }

    // === Search ===
    public void cariTiket() {
        System.out.print("Masukkan kode tiket yang dicari: ");
        String kode = input.nextLine();
        for (Tiket t : daftarTiket) {
            if (t.getKodeTiket().equals(kode)) {
                System.out.println("✅ Tiket ditemukan: " + t + "\n");
                return;
            }
        }
        System.out.println("⚠️ Tiket tidak ditemukan.\n");
    }
}
