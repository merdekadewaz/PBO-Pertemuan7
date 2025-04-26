/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Tsary");
        Pegawai pegawai2 = new Manajer("Putri");
        Manajer pegawai3 = new Manajer("Aris");

        ArrayList<Pegawai> emp = new ArrayList<>();
        emp.add(pegawai1);
        emp.add(pegawai2);
        emp.add(pegawai3);

        for (Pegawai empData : emp) {
            empData.tampilData();
            System.out.println();
        }
    }
}
