package javaprojesi;
//musteri sinifi
class Musteri extends kisi {
    public Musteri(String ad) {
        super(ad);
    }
//siparis ver metodu
    public Siparis siparisVer(Yemek yemek, Icecek icecek) {
        return new Siparis(yemek, icecek, null, null, null);
    }
}

