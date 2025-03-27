import model.*;
import service.KaryawanManager;

public class Main {
    public static void main(String[] args) {
        KaryawanManager<Karyawan> manager = new KaryawanManager<>();

        PegawaiTetap pegawai1 = new PegawaiTetap("Fahri", 101, 5000000);
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Dinar", 102, 50000);

        manager.tambahKaryawan(pegawai1);
        manager.tambahKaryawan(pegawai2);

        System.out.println("Daftar Karyawan:");
        manager.tampilkanKaryawan();
    }
}
