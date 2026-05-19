import association.Dokter;
import association.Pasien;
import aggregation.RumahSakit;

public class MainRumahSakit {

    public static void main(String[] args) {

        
        // Membuat object dokter
        
        Dokter dokter1 = new Dokter(
                "Nopal",
                "Penyakit Dalam"
        );

        Dokter dokter2 = new Dokter(
                "Pandi",
                "Anak"
        );

        
        // Membuat object pasien
        
        Pasien pasien1 = new Pasien(
                "Ujang",
                25
        );

        Pasien pasien2 = new Pasien(
                "Nardo",
                19
        );

       
        // Association
        // Dokter memeriksa pasien
        
        dokter1.periksaPasien(pasien1);

        
        // Membuat array dokter
        
        Dokter[] daftarDokter = {
                dokter1,
                dokter2
        };

       
        // Membuat Rumah Sakit
        
        RumahSakit rs = new RumahSakit(
                "RS Sehat Selalu",
                daftarDokter
        );

        // Menampilkan data rumah sakit
        System.out.println("\n===== DATA RUMAH SAKIT =====");

        rs.tampilkanRuangan();

        rs.tampilkanDokter();

        
        // Menghapus object rumah sakit
        
        rs = null;

        System.out.println(
                "\nRumah sakit telah dihapus dari sistem."
        );


        // Pembuktian relasi object
        

        // Dokter masih ada karena Aggregation
        System.out.println("\nDokter masih ada:");

        System.out.println(dokter1.nama);
        System.out.println(dokter2.nama);

        // Pasien masih ada karena Association
        System.out.println("\nPasien masih ada:");

        System.out.println(pasien1.nama);
        System.out.println(pasien2.nama);

        /*
        

        PENJELASAN RELASI OBJECT

        1. Association
           Dokter dan pasien cuma berinteraksi
           saat pemeriksaan.

        2. Aggregation
           Dokter tetap ada kaloupun object
           RumahSakit dihapus karena dokter
           dibuat di luar RumahSakit.

        3. Composition
           Ruangan ikut hilang pas object
           RumahSakit dihapus karena ruangan
           dibuat langsung di dalam constructor
           RumahSakit.

    
        */
    }
}