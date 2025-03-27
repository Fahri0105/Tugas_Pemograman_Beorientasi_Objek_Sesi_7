package model;

public abstract class Karyawan {
    private String nama;
    private int id;

    public Karyawan(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public abstract void tampilkanInfo();
}