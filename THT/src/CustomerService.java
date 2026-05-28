public class CustomerService {

    public String namaCS;

    // Constructor
    public CustomerService(String namaCS) {

        this.namaCS = namaCS;
    }

    // Association
    // Nasabah dan CS hanya berinteraksi
    public void layaniKeluhan(Nasabah nasabah,
                              String keluhan) {

        System.out.println(
                "\nCustomer Service " + namaCS +
                " sedang melayani keluhan dari " +
                nasabah.nama
        );

        System.out.println(
                "Keluhan : " + keluhan
        );
    }
}