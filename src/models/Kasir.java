package models;

public class Kasir extends Pegawai {
    private double kasYangDitangani;

    public Kasir(String namaPegawai, String idPegawai, String jabatan, int gaji, int kasYangDitangani) {
        super(namaPegawai, idPegawai, jabatan, gaji);
        this.kasYangDitangani = kasYangDitangani;
    }

    public void memprosesTransaksiPenjualan(String pelanggan) {
        // Implementasikan logika pemrosesan transaksi penjualan di sini
        System.out.println("Kasir " + getNamaPegawai() + " memproses transaksi penjualan untuk pelanggan: " + pelanggan);
    }

    public void menghitungUang() {
        // Implementasikan logika perhitungan uang di sini
        System.out.println("Kasir " + getNamaPegawai() + " menghitung uang.");
    }

    public void mencetakStruk(String pelanggan) {
        // Implementasikan logika pencetakan struk di sini
        System.out.println("Kasir " + getNamaPegawai() + " mencetak struk untuk pelanggan: " + pelanggan);
    }

    public double getKasYangDitangani() {
        return kasYangDitangani;
    }
}
