/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
public class MainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("Jarjit");
        anabul anjing = new anjing("Upin");
        anabul burung = new burung("Mail");

        kucing.gerak();
        kucing.bersuara();
        System.out.println("\n");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("\n");
        burung.gerak();
        burung.bersuara();
    }
}