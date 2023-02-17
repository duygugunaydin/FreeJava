package ders_17_Scope;

public class C_03_ObjectVariables {

    static String hastaneIsmi = "Yildiz Hastanesi";      // class variables
    static int hastaSayisi = 23453 ;                     // class variables
    static String bashekimIsmi ;                         // class variables
    String personelIsmi ;                                // object variables
    String personelTelefonu ;                            // object variables
    int personelYasi ;                                   // object variables
                                                         // AMA HEPSININ GENEL ISMI 'class level variable' DIR !!
    /*
    Class level variable'larin scope'u tum class'dir
    static kelimesi ile isaretlenen variable'lara
    class icerisinde heryerden ulasilabildigi icin diger adi >> class variables'dir.

    static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
    instance variable'lar objelere bagli olduklarindan
    bu variable'larin diger adi >> object variables'dir.
     */


    public static void main(String[] args) {

    }
}
