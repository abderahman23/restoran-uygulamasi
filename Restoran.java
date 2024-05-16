package javaprojesi;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
// Restoran sinifi
class Restoran {
    private ArrayList<Urun> menu;
    private ArrayList<Siparis> siparisler;
    private ArrayList<Musteri> musteriler;
    private ArrayList<Garson> garsonlar;

    public Restoran() {
        menu = new ArrayList<>();
        siparisler = new ArrayList<>();
        musteriler = new ArrayList<>();
        garsonlar = new ArrayList<>();
    }
    // menuye urun ekle metodu
    public void menuyeUrunEkle(Urun urun) {
        menu.add(urun);
    }
// musteri ekle metodu
    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }
//garson ekle metodu
    public void garsonEkle(Garson garson) {
        garsonlar.add(garson);
    }
// meuyu goster metodu
    public void menuyuGoster() {
        System.out.println("----Menu----");
        for (Urun urun : menu) {
            urun.urunBilgisi();
        }
        System.out.println("----------");
    }
// rasgel siparisler olustur
    public void rasgeleSiparislerOlustur(int sayi) {
        if (sayi <= 0) {
            System.out.println("Hata: 'sayi' parametresi pozitif bir değer olmalıdır.");
            return;
        }
        else {

	        if (menu.isEmpty() || musteriler.isEmpty() || garsonlar.isEmpty()) {
	            System.out.println("Hata: 'menu', 'musteriler' veya 'garsonlar' listesi boş olmamalıdır.");
	            return;
	        }
	
	        Random random = new Random();
	        for (int i = 0; i <=sayi; i++) {
	            Musteri musteri = musteriler.get(random.nextInt(musteriler.size()));
	            Yemek yemek = null;
	            Icecek icecek = null;
	
	            // Rasgele bir yemek ve içecek seç
	            Urun urun1 = menu.get(random.nextInt(menu.size()));
	            Urun urun2 = menu.get(random.nextInt(menu.size()));
	            
	            if (urun1 instanceof Yemek && urun2 instanceof Icecek) {
	                yemek = (Yemek) urun1;
	                icecek = (Icecek) urun2;
	            } else if (urun1 instanceof Icecek && urun2 instanceof Yemek) {
	                icecek = (Icecek) urun1;
	                yemek = (Yemek) urun2;
	            } else {
	            	continue;
	  
	                
	            }
	
	            // Rasgele bir garson seç
	            Garson garson = garsonlar.get(random.nextInt(garsonlar.size()));
	
	            // Şu anki zamanı temsil eden bir Date nesnesi oluştur
	            Date tarih = new Date(System.currentTimeMillis());
	
	            // Sipariş oluştur
	            Siparis siparis = new Siparis(yemek, icecek, garson, musteri, tarih);
	
	            // Siparişi garsona ver
	            garson.siparisAl(siparis, siparisler);
	
	            // Siparişi listeye ekle
	            siparisler.add(siparis);
	        }
        }
    }

}

