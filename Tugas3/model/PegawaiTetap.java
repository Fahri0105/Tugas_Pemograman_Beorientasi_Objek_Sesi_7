package model;

public class PegawaiTetap extends Karyawan {
    private double gaji;

    public PegawaiTetap(String nama, int id, double gaji) {
        super(nama, id);
        this.gaji = gaji;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + getNama() + ", ID: " + getId() + ", Gaji: " + gaji);
    }
}

