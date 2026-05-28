public class RekeningReguler extends Rekening {

    // Constructor
    public RekeningReguler(String nomorRekening,
                            String namaPemilik,
                            double saldoAwal) {

        super(nomorRekening, namaPemilik, saldoAwal);
    }

    // Polymorphism
    // Override method tarik
    @Override
    public void tarik(double jumlah) {

        double biayaAdmin = 2500;

        double total = jumlah + biayaAdmin;

        if (getSaldo() >= total) {

            kurangiSaldo(total);

            bukuMutasi.catatMutasi(
                    "Tarik uang Rp " + jumlah +
                    " dengan biaya admin Rp " + biayaAdmin
            );

        } else {

            System.out.println("Saldo tidak cukup");
        }
    }
}