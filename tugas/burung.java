/* Nama : Merdeka Dewa
 * NIM : 24060123140122
 */
public class burung extends anabul {
    public burung (String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() + "Bergerak dengan cara terbang");
    }

    @Override
    public void bersuara(){

        System.out.println(getNama() + "bersuara : Cuit-cuit");
    }
}
