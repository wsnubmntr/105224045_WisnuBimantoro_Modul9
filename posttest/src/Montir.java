public class Montir {

    public String idMontir;
    public String nama;

    // Constructor
    public Montir(String idMontir, String nama) {

        this.idMontir = idMontir;
        this.nama = nama;
    }

    // Association
    // Montir dan mobil hanya berinteraksi sesaat
    public void qualityControl(Mobil m) {

        System.out.println(
                "\nMontir " + nama +
                " sedang mengecek quality control pada mobil " +
                m.merkMobil
        );
    }
}