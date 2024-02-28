package Tugas;

public class Anggota {
    private String nomorAnggota;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorAnggota, String nama, double limitPinjaman) {
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
        this.limitPinjaman = Math.max(0, limitPinjaman);
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlahPinjam) {
        if (jumlahPinjam <= limitPinjaman - jumlahPinjaman) {
            jumlahPinjaman += jumlahPinjam;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }

    public void angsur(double bayar) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (bayar >= minimalAngsuran && bayar <= jumlahPinjaman) {
            jumlahPinjaman -= bayar;
        } else {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman");
        }
    }
}
