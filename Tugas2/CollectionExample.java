import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Fahri");
        mahasiswaList.add("Cecep");
        mahasiswaList.add("Dinar");

        System.out.println("Daftar Mahasiswa (ArrayList):");
        for (String nama : mahasiswaList) {
            System.out.println(nama);
        }

        // ArrayDeque
        ArrayDeque<Integer> antrianNomor = new ArrayDeque<>();
        antrianNomor.add(101);
        antrianNomor.add(102);
        antrianNomor.add(103);
        
        System.out.println("\nAntrian Nomor (ArrayDeque):");
        while (!antrianNomor.isEmpty()) {
            System.out.println("Nomor: " + antrianNomor.poll());
        }
    }
}
