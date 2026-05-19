package aggregation;

import association.Dokter;
import composition.Ruangan;

public class RumahSakit {

    public String namaRumahSakit;

    // Composition
    // Ruangan dibuat langsung di dalam RumahSakit
    private Ruangan[] daftarRuangan;

    // Aggregation
    // Dokter dibuat di luar lalu dimasukkan ke RumahSakit
    private Dokter[] daftarDokter;

    // Constructor
    public RumahSakit(String namaRumahSakit, Dokter[] daftarDokter) {

        this.namaRumahSakit = namaRumahSakit;

        // Aggregation
        this.daftarDokter = daftarDokter;

        // Composition
        daftarRuangan = new Ruangan[2];

        daftarRuangan[0] = new Ruangan("R-01", 10);
        daftarRuangan[1] = new Ruangan("R-02", 5);
    }

    // Method menampilkan ruangan
    public void tampilkanRuangan() {

        System.out.println("\n=== DATA RUANGAN ===");

        for (Ruangan ruang : daftarRuangan) {

            if (ruang != null) {

                System.out.println(
                        "Nomor Ruangan : " +
                        ruang.nomorRuangan +
                        ", Kapasitas : " +
                        ruang.kapasitasPasien + " pasien"
                );
            }
        }
    }

    // Method menampilkan dokter
    public void tampilkanDokter() {

        System.out.println("\n=== DATA DOKTER ===");

        for (Dokter dokter : daftarDokter) {

            if (dokter != null) {

                System.out.println(
                        "Nama Dokter : " +
                        dokter.nama +
                        ", Spesialis : " +
                        dokter.spesialis
                );
            }
        }
    }
}