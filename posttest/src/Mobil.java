public class Mobil {

    public String merkMobil;
    public String warna;

    // Composition
    // Mesin dibuat langsung di dalam Mobil
    private Mesin mesin;

    // Aggregation
    // Ban dibuat di luar abistu dipasang ke mobil
    private Ban[] setBan;

    // Constructor
    public Mobil(String merkMobil, String warna) {

        this.merkMobil = merkMobil;
        this.warna = warna;

        // Composition
        mesin = new Mesin("MSN-001", 1500);

        // Maksimal 4 ban
        setBan = new Ban[4];
    }

    // Method memasang ban
    public void pasangSetBan(Ban[] setBan) {

        for (int i = 0; i < this.setBan.length; i++) {

            this.setBan[i] = setBan[i];
        }
    }

    // Method menampilkan spesifikasi
    public void tampilkanSpesifikasi() {

        System.out.println("=== SPESIFIKASI MOBIL ===");

        System.out.println("Merk Mobil : " + merkMobil);
        System.out.println("Warna      : " + warna);

        System.out.println(
                "Mesin       : " +
                mesin.nomorSeri +
                " - " +
                mesin.kapasitasCC + " CC"
        );

        System.out.println("\nData Ban:");

        for (Ban ban : setBan) {

            if (ban != null) {

                System.out.println(
                        "Merk Ban : " +
                        ban.merk +
                        ", Ring : " +
                        ban.ring
                );
            }
        }
    }
}