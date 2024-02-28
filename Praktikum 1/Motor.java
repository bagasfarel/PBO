public class Motor {

    public static void main(String[] args) {

        String merk1, merk2, merk3, merk4, merk5;
        String warna1, warna2, warna3, warna4, warna5;
        String jenisMotor1, jenisMotor2, jenisMotor3, jenisMotor4, jenisMotor5;
        int kecepatan1, kecepatan2, kecepatan3, kecepatan4, kecepatan5;
        boolean dinyalakan1, dinyalakan2, dinyalakan3, dinyalakan4, dinyalakan5;

        merk1 = "Yamaha Nmax";
        warna1 = "Hitam";
        jenisMotor1 = "Matic";
        kecepatan1 = 50;
        dinyalakan1 = true;

        merk2 = "Honda Vario";
        warna2 = "Putih";
        jenisMotor2 = "Matic";
        kecepatan2 = 50;
        dinyalakan2 = true;

        merk3 = "Kawasaki zx25r";
        warna3 = "Hitam";
        jenisMotor3 = "Kopling";
        kecepatan3 = 120;
        dinyalakan3 = false;

        merk4 = "Honda cb150r";
        warna4 = "Putih ";
        jenisMotor4 = "Kopling";
        kecepatan4 = 80;
        dinyalakan4 = true;

        merk5 = "Honda Astrea";
        warna5 = "Hitam putih";
        jenisMotor5 = "Persenaling";
        kecepatan5 = 40;
        dinyalakan5 = false;

        kecepatan1 = tambahKecepatan(kecepatan1, 20);
        kecepatan2 = kurangKecepatan(kecepatan2, 10);
        kecepatan3 = tambahKecepatan(kecepatan3, 45);
        kecepatan4 = tambahKecepatan(kecepatan4, 20);
        kecepatan5 = kurangKecepatan(kecepatan5, 15);

        print(merk1, warna1, jenisMotor1, kecepatan1, dinyalakan1);
        print(merk2, warna2, jenisMotor2, kecepatan2, dinyalakan2);
        print(merk3, warna3, jenisMotor3, kecepatan3, dinyalakan3);
        print(merk4, warna4, jenisMotor4, kecepatan4, dinyalakan4);
        print(merk5, warna5, jenisMotor5, kecepatan5, dinyalakan5);
    }

    public static int tambahKecepatan(int kecepatan, int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    public static int kurangKecepatan(int kecepatan, int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }

    public static void print(String merk, String warna, String jenisMotor, int kecepatan, boolean dinyalakan) {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kecepatan: " + kecepatan);
        if (dinyalakan) {
            System.out.println("Status: Dinyalakan");
        } else {
            System.out.println("Status: Dimatikan");
        }
        System.out.println();
    }
}
