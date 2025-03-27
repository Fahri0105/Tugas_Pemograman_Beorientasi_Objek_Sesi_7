package model;

public class PegawaiKontrak extends Karyawan {
    private double upahPerJam;

    public PegawaiKontrak(String nama, int id, double upahPerJam) {
        super(nama, id);
        this.upahPerJam = upahPerJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Kontrak: " + getNama() + ", ID: " + getId() + ", Upah Per Jam: " + upahPerJam);
    }
}