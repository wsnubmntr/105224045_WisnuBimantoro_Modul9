public class Nasabah {

    public String nama;

    // Aggregation
    // Rekening dibuat di luar lalu dimasukkan ke Nasabah
    private Rekening[] daftarRekening;

    // Constructor
    public Nasabah(String nama) {

        this.nama = nama;

        daftarRekening = new Rekening[3];
    }

    // Menambahkan rekening
    public void tambahRekening(Rekening rekening) {

        for (int i = 0; i < daftarRekening.length; i++) {

            if (daftarRekening[i] == null) {

                daftarRekening[i] = rekening;

                System.out.println(
                        "Rekening berhasil ditambahkan"
                );

                return;
            }
        }

        System.out.println(
                "Maksimal rekening sudah penuh"
        );
    }

    // Menampilkan rekening
    public void tampilkanRekening() {

        System.out.println("\n=== DATA REKENING ===");

        for (Rekening rekening : daftarRekening) {

            if (rekening != null) {

                rekening.tampilkanInfo();
            }
        }
    }

    // Getter rekening
    public Rekening[] getDaftarRekening() {

        return daftarRekening;
    }
}