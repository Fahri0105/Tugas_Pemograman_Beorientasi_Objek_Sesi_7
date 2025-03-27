package service;
import model.Karyawan;
import java.util.ArrayList;
import java.util.List;

public class KaryawanManager<T extends Karyawan> {
    private List<T> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(T karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tampilkanKaryawan() {
        for (T karyawan : daftarKaryawan) {
            karyawan.tampilkanInfo();
        }
    }
}