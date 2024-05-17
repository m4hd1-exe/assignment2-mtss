
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class IntegerToRomanTest {
    
    @Test 
    public void DaUnoATre() {
        String uno = IntegerToRoman.converter(1);
        String due = IntegerToRoman.converter(2);
        String tre = IntegerToRoman.converter(3);
        assertEquals("I", uno);
        assertEquals("II", due);
        assertEquals("III", tre);
    }

    @Test
    public void DaQuattroASei() {
        String quattro = IntegerToRoman.converter(4);
        String cinque = IntegerToRoman.converter(5);
        String sei = IntegerToRoman.converter(6);
        assertEquals("IV", quattro);
        assertEquals("V", cinque);
        assertEquals("VI", sei);
    }

    @Test
    public void DaSetteADieci() {
        String sette = IntegerToRoman.converter(7);
        String nove = IntegerToRoman.converter(9);
        String dieci = IntegerToRoman.converter(10);
        assertEquals("VII", sette);
        assertEquals("IX", nove);
        assertEquals("X", dieci);
    }

    @Test
    public void DaUndiciAVenti() {
        String undici = IntegerToRoman.converter(11);
        String quindici = IntegerToRoman.converter(15);
        String dicciannove = IntegerToRoman.converter(19);
        String venti = IntegerToRoman.converter(20);
        assertEquals("XI", undici);
        assertEquals("XV", quindici);
        assertEquals("XIX", dicciannove);
        assertEquals("XX", venti);
    }
    
    @Test
    public void DaVentunoACinquanta() {
        String ventuno = IntegerToRoman.converter(21);
        String trentanove = IntegerToRoman.converter(39);
        String quaranta = IntegerToRoman.converter(40);
        String quarantanove = IntegerToRoman.converter(49);
        String cinquanta = IntegerToRoman.converter(50);
        assertEquals("XXI", ventuno);
        assertEquals("XXXIX", trentanove);
        assertEquals("XL", quaranta);
        assertEquals("XLIX", quarantanove);
        assertEquals("L", cinquanta);
    }

    @Test
    public void DaCinquantunoAcento() {
        String cinquantuno = IntegerToRoman.converter(51);
        String ottantanove = IntegerToRoman.converter(89);
        String novanta = IntegerToRoman.converter(90);
        String novantanove = IntegerToRoman.converter(99);
        String cento = IntegerToRoman.converter(100);
        assertEquals("LI", cinquantuno);
        assertEquals("LXXXIX", ottantanove);
        assertEquals("XC", novanta);
        assertEquals("XCIX", novantanove);
        assertEquals("C", cento);
    }

    @Test
    public void DaCentounoACinquecento() {
        String centouno = IntegerToRoman.converter(101);
        String trecentonovantanove = IntegerToRoman.converter(399);
        String quattrocento = IntegerToRoman.converter(400);
        String quattrocentonovantanove = IntegerToRoman.converter(499);
        String cinquecento = IntegerToRoman.converter(500);
        assertEquals("CI", centouno);
        assertEquals("CCCXCIX", trecentonovantanove);
        assertEquals("CD", quattrocento);
        assertEquals("CDXCIX", quattrocentonovantanove);
        assertEquals("D", cinquecento);
    }

    @Test
    public void DaCinquecentounoAMille() {
        String cinquecentouno = IntegerToRoman.converter(501);
        String ottocentonovantanove = IntegerToRoman.converter(899);
        String novecento = IntegerToRoman.converter(900);
        String novecentonovantanove = IntegerToRoman.converter(999);
        String mille = IntegerToRoman.converter(1000);
        assertEquals("DI", cinquecentouno);
        assertEquals("DCCCXCIX", ottocentonovantanove);
        assertEquals("CM", novecento);
        assertEquals("CMXCIX", novecentonovantanove);
        assertEquals("M", mille);
    }

    @Test(expected = IllegalArgumentException.class)
    public void LimiteInferiore() {
        IntegerToRoman.converter(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void LimiteSuperiore() {
        IntegerToRoman.converter(4000);
    }
        

}
