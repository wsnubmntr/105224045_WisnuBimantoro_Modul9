class KomputerServer {

    // KOMPOSISI
    // Harddisk dibuat langsung di dalam class KomputerServer
    // sehingga harddisk bergantung penuh pada server
    Harddisk harddisk;

    // AGREGASI
    // Monitor dibuat di luar class lalu diberikan ke server
    // sehingga monitor tetap bisa berdiri sendiri
    Monitor[] monitor;

    public KomputerServer(Monitor[] monitor) {

        // Komposisi -> object dibuat di dalam constructor
        this.harddisk = new Harddisk("Seagate", 1000);

        // Agregasi -> object diterima dari luar
        this.monitor = monitor;
    }
}