package semester2;

class BidangDuaDimensi {

    protected String nama;

    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("nama bangun: " + nama);
    }

    public void luas() {

    }

}

class bujurSangkar extends BidangDuaDimensi {

    protected double sisi;

    public bujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public void luas() {
        double hasil = sisi * sisi;
        System.out.println("Luas bujur sangkar = " + hasil);
    }
}

class lingkaran extends BidangDuaDimensi {

    protected double jari;

    public lingkaran(String nama, double jari) {
        super(nama);
        this.jari = jari;
    }

    public void luas() {
        double hasil = Math.PI * jari * jari;
        System.out.println("Luas lingkaran = " + hasil);
    }

}

public class App {

    public static void main(String[] args) {
        bujurSangkar bs = new bujurSangkar("Bujur Sangkar", 4);
        lingkaran lk = new lingkaran("Lingkaran", 7);

        bs.info();
        bs.luas();

        System.out.println();

        lk.info();
        lk.luas();
    }
}

