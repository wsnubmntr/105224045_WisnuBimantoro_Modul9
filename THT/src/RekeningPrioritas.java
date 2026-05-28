public class RekeningPrioritas extends Rekening {

    // Constructor
    public RekeningPrioritas(String nomorRekening,
                             String namaPemilik,
                             double saldoAwal) {

        super(nomorRekening, namaPemilik, saldoAwal);
    }

    // Polymorphism
    // Override method tarik
    @Override
    public void tarik(double jumlah) {

        // Minimum penarikan
        if (jumlah < 100000) {

            System.out.println(
                    "Minimal penarikan rekening prioritas Rp 100000"
            );

            return;
        }

        if (getSaldo() >= jumlah) {

            kurangiSaldo(jumlah);

            bukuMutasi.catatMutasi(
                    "Tarik uang Rp " + jumlah
            );

        } else {

            System.out.println("Saldo tidak cukup");
        }
    }
}