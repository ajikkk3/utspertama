package pengguna;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("username", "password", "Aji Bagus Prasetya", "G.111.19.0045", 8);

        System.out.println("Username: " + mahasiswa.getUsername());
        System.out.println("Password: " + mahasiswa.getPassword());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("SMT: " + mahasiswa.getSmt());

        // Mengubah nilai atribut menggunakan setter
        mahasiswa.setNama("Aji Bagus Prasetya 0045");
        mahasiswa.setNim("G111190045");
        mahasiswa.setSmt(7);

        System.out.println("Nama (setelah perubahan): " + mahasiswa.getNama());
        System.out.println("NIM (setelah perubahan): " + mahasiswa.getNim());
        System.out.println("SMT (setelah perubahan): " + mahasiswa.getSmt());
    }
}