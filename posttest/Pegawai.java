/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
public class Pegawai {
    protected String nama;
    protected int gajiPokok = 4000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
