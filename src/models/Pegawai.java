package models;

public abstract class Pegawai {
    private String namaPegawai;
    private String idPegawai;
    private String jabatan;
    private int gaji;

    public Pegawai(String namaPegawai, String idPegawai, String jabatan, int gaji) {
        this.namaPegawai = namaPegawai;
        this.idPegawai = idPegawai;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Abstract method untuk menghitung gaji
    public int hitungGaji() {
        // Implementasi perhitungan gaji khusus untuk Pegawai (atau biarkan abstract jika tidak ada)
        return gaji;
    }

    public String getidPegawai() {
        return idPegawai;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public String getJabatan(){
        return jabatan;
    }

    public int getGaji(){
        return gaji;
    }
}



