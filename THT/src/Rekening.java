public abstract class Rekening implements Otorisasi {

    protected String nomorRekening;
    protected String namaPemilik;

    // Encapsulation
    // Saldo tidak bisa diakses langsung dari luar
    private double saldo;

    // Composition
    // BukuMutasi dibuat langsung di constructor
    protected BukuMutasi bukuMutasi;

    // Constructor
    public Rekening(String nomorRekening,
                     String namaPemilik,
                     double saldoAwal) {

        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;

        // Composition
        bukuMutasi = new BukuMutasi();
    }

    // Getter saldo
    public double getSaldo() {

        return saldo;
    }

    // Method setor
    public void setor(double jumlah) {

        saldo += jumlah;

        bukuMutasi.catatMutasi(
                "Setor uang sebesar Rp " + jumlah
        );
    }

    // Method tarik
    public abstract void tarik(double jumlah);

    // Method untuk mengurangi saldo
    protected void kurangiSaldo(double jumlah) {

        saldo -= jumlah;
    }

    // Implementasi interface
    @Override
    public void verifikasiPIN(String pin) {

        if (pin.equals("1234")) {

            System.out.println("PIN berhasil diverifikasi");
        } else {

            System.out.println("PIN salah");
        }
    }

    // Menampilkan info rekening
    public void tampilkanInfo() {

        System.out.println("\nNomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo          : Rp " + saldo);
    }
}