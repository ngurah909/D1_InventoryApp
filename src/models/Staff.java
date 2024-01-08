package models;
public class Staff extends Pegawai {
    private String tanggungJawabKhusus;

    public Staff(String namaPegawai, String idPegawai, String jabatan, int gaji, String tanggungJawabKhusus) {
        super(namaPegawai, idPegawai, jabatan, gaji);
        this.tanggungJawabKhusus = tanggungJawabKhusus;
    }

    public void menanganiTugasKhusus() {
        // Implementasikan logika penanganan tugas khusus di sini
        System.out.println("Staff " + getNamaPegawai() + " menangani tugas khusus: " + tanggungJawabKhusus);
    }

    public void mendukungPelanggan(String pelanggan) {
        // Implementasikan logika dukungan pelanggan di sini
        System.out.println("Staff " + getNamaPegawai() + " mendukung pelanggan: " + pelanggan);
    }

    public String getTanggungJawabKhusus() {
        return tanggungJawabKhusus;
    }
}