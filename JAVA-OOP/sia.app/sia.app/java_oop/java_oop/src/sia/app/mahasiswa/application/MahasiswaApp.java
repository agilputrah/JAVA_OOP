package sia.app.mahasiswa.application;

import sia.app.mahasiswa.data.mahasiswa;
public class MahasiswaApp {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("41821120030", "agil putra herawan", "Laki-laki", "089510027912");
        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.gender);
        System.out.println(mhs.PhoneNumber);
    }
}
