import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Nasabah nasabah = null;

        CustomerService cs =
                new CustomerService("Sinta");

        int pilihan;

        do {

            System.out.println("\n===== NEOBANK =====");

            System.out.println("1. Registrasi Nasabah");
            System.out.println("2. Buka Rekening");
            System.out.println("3. Login Rekening");
            System.out.println("4. Setor Uang");
            System.out.println("5. Tarik Uang");
            System.out.println("6. Hubungi Customer Service");
            System.out.println("7. Tampilkan Rekening");
            System.out.println("8. Keluar");

            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Nama Nasabah : ");
                    String nama = input.nextLine();

                    nasabah = new Nasabah(nama);

                    System.out.println(
                            "Nasabah berhasil dibuat"
                    );

                    break;

                case 2:

                    if (nasabah == null) {

                        System.out.println(
                                "Buat nasabah terlebih dahulu"
                        );

                        break;
                    }

                    System.out.println("\n1. Reguler");
                    System.out.println("2. Prioritas");

                    System.out.print("Pilih jenis rekening : ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Nomor Rekening : ");
                    String norek = input.nextLine();

                    System.out.print("Saldo Awal : ");
                    double saldoAwal = input.nextDouble();

                    Rekening rekening;

                    if (jenis == 1) {

                        rekening =
                                new RekeningReguler(
                                        norek,
                                        nasabah.nama,
                                        saldoAwal
                                );

                    } else {

                        rekening =
                                new RekeningPrioritas(
                                        norek,
                                        nasabah.nama,
                                        saldoAwal
                                );
                    }

                    nasabah.tambahRekening(rekening);

                    break;

                case 3:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    Rekening[] daftar =
                            nasabah.getDaftarRekening();

                    if (daftar[0] == null) {

                        System.out.println(
                                "Belum ada rekening"
                        );

                        break;
                    }

                    System.out.print("Masukkan PIN : ");
                    String pin = input.nextLine();

                    daftar[0].verifikasiPIN(pin);

                    break;

                case 4:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    System.out.print(
                            "Jumlah setor : "
                    );

                    double setor = input.nextDouble();

                    nasabah.getDaftarRekening()[0]
                            .setor(setor);

                    break;

                case 5:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    System.out.print(
                            "Jumlah tarik : "
                    );

                    double tarik = input.nextDouble();

                    nasabah.getDaftarRekening()[0]
                            .tarik(tarik);

                    break;

                case 6:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    System.out.print(
                            "Masukkan keluhan : "
                    );

                    input.nextLine();

                    String keluhan =
                            input.nextLine();

                    cs.layaniKeluhan(
                            nasabah,
                            keluhan
                    );

                    break;

                case 7:

                    if (nasabah == null) {

                        System.out.println(
                                "Belum ada nasabah"
                        );

                        break;
                    }

                    nasabah.tampilkanRekening();

                    break;

                case 8:

                    System.out.println(
                            "Program selesai"
                    );

                    break;

                default:

                    System.out.println(
                            "Menu tidak tersedia"
                    );
            }

        } while (pilihan != 8);

        // =====================================
        // Simulasi penutupan akun
        // =====================================

        nasabah = null;

        /*
        =====================================

        ANALISIS RELASI OBJECT

        1. Composition
           BukuMutasi ikut hilang kalo object
           Rekening hancurin karena dibuat
           langsung di dalam constructor Rekening.

        2. Aggregation
           Object Rekening tetep bisa ada
           walaupun object Nasabah dihapus
           karena rekening dibuat di luar
           lalu dimasukkan ke dalem Nasabah.

        3. Association
           CustomerService dan Nasabah hanya
           berinteraksi saat proses pelayanan
           keluhan tanpa saling memiliki.

        4. Encapsulation
           Saldo dibuat private sehingga tidak
           bisa diakses langsung dari luar class.

        5. Inheritance
           RekeningReguler dan
           RekeningPrioritas itu turunan
           dari abstract class Rekening.

        6. Polymorphism
           Method tarik() dioverride beda dari
           pada masing-masing jenis rekening.

        =====================================
        */
    }
}