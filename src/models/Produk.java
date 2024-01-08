package models;
public class Produk {
    private String namaProduk;
    private int harga;
    private int stok;
    private String kodeProduk;
    private String kategori;
    private String tanggalKadaluarsa;

    public Produk(String namaProduk, int harga, int stok, String kodeProduk, String kategori, String tanggalKadaluarsa) {
        if (namaProduk == null || kodeProduk == null || kategori == null || tanggalKadaluarsa == null || harga < 0 || stok < 0) {
            throw new IllegalArgumentException("Nilai parameter tidak valid");
        }
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.kodeProduk = kodeProduk;
        this.kategori = kategori;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    

    public String getNamaProduk(){
        return namaProduk;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup.");
        }
    }

    public void tampilkanInformasiProduk() {
        System.out.println("Nama Produk         : " + namaProduk);
        System.out.println("Harga               : " + harga);
        System.out.println("Stok                : " + stok);
        System.out.println("Kode Produk         : " + kodeProduk);
        System.out.println("Kategori            : " + kategori);
        System.out.println("Tanggal Kadaluarsa  : " + tanggalKadaluarsa);
    }
}
