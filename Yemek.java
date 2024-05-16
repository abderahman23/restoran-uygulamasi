package javaprojesi;

// yemek sinifi
class Yemek extends Urun {
    private String tur;

    public Yemek(String ad, double fiyat, String tur) {
        super(ad, fiyat);
        this.tur = tur;
    }
    
// urun bilgisi metodu
    @Override
    public void urunBilgisi() {
        System.out.println("Yemek Adi: " + ad);
        System.out.println("Fiyati: " + fiyat + " TL");
        System.out.println("Turu: " + tur);
    }
}




