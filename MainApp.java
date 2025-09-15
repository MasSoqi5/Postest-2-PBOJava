
package main;

import Service.TiketService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TiketService service = new TiketService();

        while (true) {
            System.out.println("===== MENU MANAJEMEN TIKET KAPAL =====");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Tampilkan Tiket");
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Cari Tiket");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = input.nextLine();
            System.out.println();

            switch (pilihan) {
                case "1":
                    service.tambahTiket();
                    break;
                case "2":
                    service.tampilkanTiket();
                    break;
                case "3":
                    service.updateTiket();
                    break;
                case "4":
                    service.hapusTiket();
                    break;
                case "5":
                    service.cariTiket();
                    break;
                case "6":
                    System.out.println("👋 Terima kasih, program selesai.");
                    return;
                default:
                    System.out.println("⚠️ Pilihan tidak valid.\n");
            }
        }
    }
}
