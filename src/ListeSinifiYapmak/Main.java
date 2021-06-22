package ListeSinifiYapmak;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        System.out.println("--------------------------------------------------------------------------");

        MyList<Integer> liste2 = new MyList<>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        liste2.remove(2);
        liste2.add(40);
        liste2.set(0, 100);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        System.out.println(liste2);


        System.out.println("--------------------------------------------------------------------------");

        MyList<Integer> liste3 = new MyList<>();
        System.out.println("liste3 Durumu : " + (liste3.isEmpty() ? "Boş" : "Dolu"));
        liste3.add(10);
        liste3.add(20);
        liste3.add(30);
        liste3.add(40);
        liste3.add(20);
        liste3.add(50);
        liste3.add(60);
        liste3.add(70);

        System.out.println("liste3 Durumu : " + (liste3.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste3.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste3.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste3.lastIndexOf(20));

        // liste3yi Object[] dizisi olarak geri verir.
        Object[] dizi = liste3.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        // liste3 veri türünde alt bir liste3 oluşturdu
        MyList<Integer> altliste3m = liste3.subList(0, 3);
        System.out.println(altliste3m.toString());

        // Değerim liste3deki olup olmadığını sorguladı
        System.out.println("liste3mde 20 değeri : " + liste3.contains(20));
        System.out.println("liste3mde 120 değeri : " + liste3.contains(120));

        // liste3yi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste3.clear();
        System.out.println(liste3);



        /*
        MyList<String> liste = new MyList<>();

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        liste.add("a");

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        liste.add("sdas");
        liste.add("sdgg");
        liste.add("cghfghcv");
        liste.add("jhfjnf");
        liste.add("sdf51s65");

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        liste.add("d5bcvx51b");
        liste.add("df4g6x5c");
        liste.add("df4vxc");
        //liste.add("f5vxczxx");


        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        liste.add("s6d1fd");

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        liste.add("a");
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        System.out.println(liste.indexOf("a"));
        System.out.println(liste.lastIndexOf("a"));

       // liste.clear();
        liste.add("asdasd");
        liste.add("938hf9ehf");



        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println();

        MyList<String > subList = liste.sublist(3,13);
        Object[] dizi2 = subList.toArray();
        System.out.println(Arrays.toString(Arrays.stream(dizi2).toArray()));
        liste.add("abc");
        liste.remove(0);
        System.out.println(liste.isEmpty());

        Object[] dizi = liste.toArray();
        System.out.println(Arrays.toString(Arrays.stream(dizi).toArray()));
        System.out.println(

        liste.contains("938hf9ehf"));*/

    }
}
