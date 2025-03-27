public class MahasiswaKu {
  public static void main(String[] args) {
      Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
      m.setNim("20230040306");
      m.setNama("M FAHRI RIVALDI");
      m.setClas(23);

      System.out.println(m.getNim());
      System.out.println(m.getNama());  
      System.out.println(m.getClas());
  }
}

class Mahasiswa<T, U, V> {
  private T nim;
  private U nama;
  private V clas;

  public void setNim(T nim) {
      this.nim = nim;
  }

  public T getNim() {
      return nim;
  }

  public void setNama(U nama) {
      this.nama = nama;
  }

  public U getNama() {
      return nama;
  }

  public void setClas(V clas) {
      this.clas = clas;
  }

  public V getClas() {
      return clas;
  }
}
