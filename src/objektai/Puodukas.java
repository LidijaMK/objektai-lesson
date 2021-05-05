package objektai;

public class Puodukas {

    // Aprasome klase su savybemis - properties
    // savybes turi defaltines reiksmes - 0;
    public int turis;
    public char spalva;
    public int kiekis;

    public void ipilk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        kiekis += kiek;
        if (kiekis > turis) {
            kiekis = turis;
        }

    }

//     public void isgerk(int kiek) {
//        if (kiek > 0) {
//            kiekis -= kiek;
//            if (kiekis < 0) {
//                kiekis = 0;
//            }
//        }
    public void isgerk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        kiekis -= kiek;
        if (kiekis < 0) {
            kiekis = 0;
        }
    }
}

//       public void ipilk(int kiek) { //sukuriamas naujas scope
//        kiekis += kiek;          // kintamasis kiek (50) / (100)
//    }                            // this  - nuoroda p 
//                                 // kiekis += kiek   kiekis = 0 + 50 = 50;  / 50 + 100 = 150

