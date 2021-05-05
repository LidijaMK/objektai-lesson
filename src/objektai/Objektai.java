package objektai;

public class Objektai {

    public static void main(String[] args) {
        // objektinis tipas; operatorius new - pasiziuri koki objekta norime pagaminti ir sukuria nauja objekta (su class'eje nurodytom savybem)
        // Objektiniai kintamieji nesaugo pacio objekto, t.y. nuoroda (p) kur tas objektas guli

//        Puodukas p = new Puodukas();
//        // tipas - Puodukas
//        // p - kintamasis
//        p.turis = 300;
//        p.spalva = 'r';
//        p.kiekis = 0;
//        
//        Puodukas kp = new Puodukas();
//        kp.turis = 300;
//        kp.spalva = 'r';
//        kp.kiekis = 0;
//        
//        Puodukas dvp = kp;
//        
//        System.out.println(kp == p);
//        System.out.println(kp == dvp);
//
//        p.ipilk(100); // metodo iskvietimas -> sukuriamas naujas scope / specialusis kitamasis this (kontekstinis kintamasis, eina pagal nuoroda p)
//        System.out.println(p.kiekis);
//        p.ipilk(100);
//        System.out.println(p.kiekis);
//        p.ipilk(500);
//        System.out.println(p.kiekis);
//        System.out.println("geriam");
//        p.isgerk(150);
//        System.out.println(p.kiekis);
//        p.isgerk(250);
//        System.out.println(p.kiekis);
//
//        p.ipilk(-500);
//        System.out.println(p.kiekis);
//        Puodukas kp = new Puodukas();
//        kp.turis = 150;
//        kp.spalva = 'b';
//        kp.kiekis = 100;
//
//      
//        Puodukas dvp = p;    // dvp priskiriame ta pacia nuoroda p 
//        dvp.kiekis = 200;
//
//        System.out.println(p.turis);
//        System.out.println(kp.turis);
//        System.out.println("-----");
//        System.out.println(p.kiekis);
//        System.out.println(kp.kiekis);
//        System.out.println(dvp.kiekis);
//
//        dvp = kp;
//        dvp.kiekis = 20;
//        System.out.println("2-----");
//        System.out.println(p.kiekis);
//        System.out.println(kp.kiekis);
//        System.out.println(dvp.kiekis);
//        String s = "Labas";
//        System.out.println(s);
////        s = "Labai " + s + " pasauli";  // kintamasis s rodo i naujai sukurta objekta ->  "Labai " + s + " pasauli"
////        System.out.println(s);
//        s = s + 101 + 202;
//        // "Labas101"
//        // "Labas101" + "202"
//        // "Lbas101202"
//     //   s = 101 + 202 + s;
//        //      303    + "Labas"
//        //     "303" + "Labas"
//        //     "303Labas"
//        
//        System.out.println(s);
//    }
        String s = "L\ta\\\"b\r\na\u53c3s";
        String s1= "Labas";
        
        String s2 = "La";
        s2 += "bas";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s == s1);
        System.out.println(s == s2);
    }
}
