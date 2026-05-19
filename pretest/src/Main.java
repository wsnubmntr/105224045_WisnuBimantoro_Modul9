public class Main {

    public static void main(String[] args) {

        // Object monitor dibuat terpisah di luar server
        Monitor m1 = new Monitor("LG", 24);
        Monitor m2 = new Monitor("Samsung", 27);

        Monitor[] daftarMonitor = {m1, m2};

        // Monitor dimasukkan ke dalam server
        KomputerServer server = new KomputerServer(daftarMonitor);
    }
}