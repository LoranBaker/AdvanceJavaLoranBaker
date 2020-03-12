/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class GenericExectuor {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Loran");
        String prvielement = lista.get(0);
        //1.4 verzija jave
        Box tarikovaKutija = new Box();
        tarikovaKutija.setObject("Tarik");
        String vrijednostUtarikovojKutiji = (String)tarikovaKutija.getObject();
        Box farukovaKutija = new Box ();
        farukovaKutija.setObject(new Integer(23));
        Integer vrijednostUFarukovojoKutiji = (Integer )farukovaKutija.getObject();
        //Java 1.7(1.5, 1.6);
        Box<String> mojaKutija = new Box<String>();
        mojaKutija.setObject("Moja kutija");
        String vrijednostUMojojKutiji = mojaKutija.getObject();
        //1.7
        Box<Double> mojaKutijaDruga = new Box();
        mojaKutijaDruga.setObject(0.4);
        Double sadrzaj = mojaKutijaDruga.getObject();
        
        
    }
}
