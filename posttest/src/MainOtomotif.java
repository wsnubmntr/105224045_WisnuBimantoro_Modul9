public class MainOtomotif {

    public static void main(String[] args) {

        
        // Membuat 4 ban mandiri
        
        Ban ban1 = new Ban("Bridgestone", 17);
        Ban ban2 = new Ban("Bridgestone", 17);
        Ban ban3 = new Ban("Bridgestone", 17);
        Ban ban4 = new Ban("Bridgestone", 17);

        
        // Membuat object mobil
        
        Mobil mobil1 = new Mobil(
                "Misubishi Ruswan",
                "Hitam"
        );

        
        // Membuat array ban
        
        Ban[] daftarBan = {
                ban1,
                ban2,
                ban3,
                ban4
        };

        // Memasang ban ke mobil
        mobil1.pasangSetBan(daftarBan);

        // Menampilkan spesifikasi mobil
        mobil1.tampilkanSpesifikasi();

        // Membuat object montir
        Montir montir1 = new Montir(
                "M001",
                "BudiSpeed"
        );

        // Association
        // Montir mengecek mobil
        montir1.qualityControl(mobil1);

        // Mobil gagal uji kelayakan
        mobil1 = null;

        System.out.println(
                "\nMobil gagal uji kelayakan dan dihancurkan."
        );

        // Pembuktian relasi object

        // Ban masih ada karena Aggregation
        System.out.println("\nBan masih ada di gudang:");

        System.out.println(ban1.merk);
        System.out.println(ban2.merk);
        System.out.println(ban3.merk);
        System.out.println(ban4.merk);

        /*

        PENJELASAN RELASI OBJECT

        1. Association
           Montir dan mobil cuma berinteraksi
           pas saat proses quality control.

        2. Aggregation
           Ban tetap ada walaupun mobil dihancurkan
           karena ban dibuat di luar object Mobil.

        3. Composition
           Mesin ikut hilang pas object Mobil
           dihancurkan karena mesin dibuat langsung
           di dalam constructor Mobil.

        */
    }
}