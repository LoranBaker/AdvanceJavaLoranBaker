package one;

public class GenericExecutor {
    public static void main(String[] args) {

    //Backwar compatibility 1998 RAW type 1.4
     Box tarikovaKutija = new Box();
     tarikovaKutija.setObject("Tarik");
     String vrijednoUPoljuTarikoveKutije = (String) tarikovaKutija.getObject();
     
     Box mojaKutija = new Box();
     mojaKutija.setObject(new Integer(23));
     Integer vrijednostUPoljuMojeKutije = (Integer) mojaKutija.getObject();
     //<1.7
     Box<String> fadilovaKutija = new Box<String>();
     fadilovaKutija.setObject("Fadil");
     String vrijednostUPoljuFadiloveKutije = (String) fadilovaKutija.getObject();
     
     //1.5, 1.6, 1.7
     Box<Double> mahirovaKutija = new Box<>();
     mahirovaKutija.setObject(0.4);
     Double sadrzaj = mahirovaKutija.getObject();
     //zamjena za T, S, E, U -> objektni tipovi
        System.out.println(vrijednoUPoljuTarikoveKutije);
        System.out.println(vrijednostUPoljuFadiloveKutije);
        System.out.println(vrijednostUPoljuMojeKutije);
    }
    
}

