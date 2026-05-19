package association;

public class Dokter {

    public String nama;
    public String spesialis;

    // Constructor
    public Dokter(String nama, String spesialis) {

        this.nama = nama;
        this.spesialis = spesialis;
    }

    // Association
    // Dokter cuma berinteraksi sama pasien
    public void periksaPasien(Pasien pasien) {

        System.out.println(
                "Dokter " + nama +
                " spesialis " + spesialis +
                " sedang memeriksa pasien " + pasien.nama +
                " umur " + pasien.umur + " tahun."
        );
    }
}