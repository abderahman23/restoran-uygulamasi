package javaprojesi;

import java.io.PrintWriter;
import java.sql.Date;
//siparis sinifi
class Siparis {
    private Yemek yemek;
    private Icecek icecek;
    private Musteri musteri;
    public Garson garson;
    public Date tarih;
    public static long siparisNo;

    public Siparis(Yemek yemek, Icecek icecek, Garson garson, Musteri musteri, Date tarih) {
        this.yemek = yemek;
        this.icecek = icecek;
        this.garson = garson;
        this.musteri = musteri;
        this.tarih = tarih;
        this.siparisNo = siparisNo++;
    }
    //siparis bilgisi metodu
    public void siparisBilgisi() {
        System.out.println("------Menu-----");
        System.out.println("Yemek:" + (yemek != null ? yemek.getAd() + " - " + yemek.getFiyat() + " TL" : "(Yemek secilmedi)"));
        System.out.println("Icecek:" + (icecek != null ? icecek.getAd() + " - " + icecek.getFiyat() + " TL" : "(Icecek secilmedi)"));
        System.out.println("Garson:" + (garson != null ? garson.getAd() : "(Garson atanmadi)"));
        System.out.println("Musteri:" + (musteri != null ? musteri.getAd() : "(Musteri atanmadi)"));
        System.out.println("Tarih:" + (tarih != null ? tarih.toString() : "(Tarih belirtilmedi)"));
        System.out.println("-----------------------");
    }
    //siparis yazidr metodu
    public void siparisYazdir(PrintWriter yazici) {
        yazici.println("Siparis Bilgileri:");
        yazici.println("Yemek: " + (yemek != null ? yemek + " - " + yemek : "(Yemek secilmedi)"));
        yazici.println("Icecek: " + (icecek != null ? icecek + " - " + icecek : "(Icecek secilmedi)"));
        yazici.println("Garson: " + (garson != null ? garson.getAd() : "(Garson atanmadi)"));
        yazici.println("Musteri: " + (musteri != null ? musteri.getAd() : "(Musteri atanmadi)"));
        yazici.println("Zaman: " + (tarih != null ? tarih.toString() : "(Tarih belirtilmedi)"));
        yazici.println("---------------------");
    }
}










