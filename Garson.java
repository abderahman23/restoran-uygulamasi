package javaprojesi;

import java.util.ArrayList;
// garson sinifi
class Garson extends kisi {
    public Garson(String ad) {
        super(ad);
    }
//siparis al metodu
    public void siparisAl(Siparis s, ArrayList<Siparis> siparisler) {
        s.siparisBilgisi();
        siparisler.add(s);
        System.out.println("Siparis alindi");
    }
}
