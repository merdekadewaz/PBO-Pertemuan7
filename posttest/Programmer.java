/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
public class Programmer extends Pegawai {
    private int bonus = 444000;

    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
