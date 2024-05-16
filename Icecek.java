package javaprojesi;

//icecek sinifi
class Icecek extends Urun {
    private String boy;

    public Icecek(String ad, double fiyat, String boy) {
        super(ad, fiyat);
        this.boy = boy;
    }
    //urunbilgisi metodu
    @Override
    public void urunBilgisi() {
        System.out.println("Icecek: " + ad);
        System.out.println("Fiyati: " + fiyat + " TL");
        System.out.println("Boyutu: " + boy);
    }
}



