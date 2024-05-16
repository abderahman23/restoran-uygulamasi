package javaprojesi;

public class Test {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();

        // Menuye urunleri ekle
        restoran.menuyeUrunEkle(new Yemek("Bursa kebabi", 250.0, "kebap"));
        restoran.menuyeUrunEkle(new Yemek("lahmacun", 60, "firin"));
        restoran.menuyeUrunEkle(new Yemek("pide", 100, "firin"));

        restoran.menuyeUrunEkle(new Icecek("Ayran", 20.0, "kucuk"));
        restoran.menuyeUrunEkle(new Icecek("kola", 25.0, "kutu"));
        restoran.menuyeUrunEkle(new Icecek("Ayran", 30.0, "Buyuk"));

        // Garsonlari ve musterileri ekle
        restoran.garsonEkle(new Garson("Ali"));
        restoran.garsonEkle(new Garson("Fatma"));
        restoran.garsonEkle(new Garson("Veli"));

        restoran.musteriEkle(new Musteri("Ahmet"));
        restoran.musteriEkle(new Musteri("Ayse"));
        restoran.musteriEkle(new Musteri("Mehmet"));

        restoran.menuyuGoster();
        restoran.rasgeleSiparislerOlustur(10);
    }
}