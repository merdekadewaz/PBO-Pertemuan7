/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
public class Manajer extends Pegawai {
    private int tunjangan = 600000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
