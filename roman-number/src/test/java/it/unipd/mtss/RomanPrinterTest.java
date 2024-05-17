////////////////////////////////////////////////////////////////////
// Oussama Mahdi     2081617
// Alberto Canavese  2076423
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    @Test
    public void carattere_I() {
        try (
            MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.converter(1))
                .thenReturn("I");

            String result = RomanPrinter.print(1);

            assertEquals(result, 
                "  _____ \n" +
                " |_   _|\n" +
                "   | |  \n" +
                "   | |  \n" +
                "  _| |_ \n" +
                " |_____|\n");
        }
    }

    @Test
    public void carattere_V() {
        try (
            MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.converter(5))
                .thenReturn("V");

            String result = RomanPrinter.print(5);

            assertEquals(result, 
                " __      __\n" +
                " \\ \\    / /\n" +
                "  \\ \\  / / \n" +
                "   \\ \\/ /  \n" +
                "    \\  /   \n" +
                "     \\/    \n");
        }
    }

    @Test
public void carattere_X() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(10))
            .thenReturn("X");

        String result = RomanPrinter.print(10);

        assertEquals(result, 
            " __   __\n" +
            " \\ \\ / /\n" +
            "  \\ V / \n" +
            "   > <  \n" +
            "  / . \\ \n" +
            " /_/ \\_\\\n");
    }
}

@Test
public void carattere_L() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(50))
            .thenReturn("L");

        String result = RomanPrinter.print(50);

        assertEquals(result, 
            "  _      \n" +
            " | |     \n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            " |______|\n");
    }
}

@Test
public void carattere_C() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(100))
            .thenReturn("C");

        String result = RomanPrinter.print(100);

        assertEquals(result, 
            "   _____ \n" +
            "  / ____|\n" +
            " | |     \n" +
            " | |     \n" +
            " | |____ \n" +
            "  \\_____|\n");
    }
}

@Test
public void carattere_D() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(500))
            .thenReturn("D");

        String result = RomanPrinter.print(500);

        assertEquals(result, 
            "  _____  \n" +
            " |  __ \\ \n" +
            " | |  | |\n" +
            " | |  | |\n" +
            " | |__| |\n" +
            " |_____/ \n");
    }
}

@Test
public void carattere_M() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(1000))
            .thenReturn("M");

        String result = RomanPrinter.print(1000);

        assertEquals(result, 
            "  __  __ \n" +
            " |  \\/  |\n" +
            " | \\  / |\n" +
            " | |\\/| |\n" +
            " | |  | |\n" +
            " |_|  |_|\n");
    }
}

@Test
public void caratteri_IV() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(4))
            .thenReturn("IV");

        String result = RomanPrinter.print(4);

        assertEquals(result, 
        "  _____  __      __\n" +
        " |_   _| \\ \\    / /\n" +
        "   | |    \\ \\  / / \n" +
        "   | |     \\ \\/ /  \n" +
        "  _| |_     \\  /   \n" +
        " |_____|     \\/    \n");
    }
    
}
@Test
    public void caratteri_CMXCIX() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.converter(999)).thenReturn("CMXCIX");

            String expected = 
            "   _____   __  __  __   __   _____   _____  __   __\n" +
            "  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n" +
            " | |      | \\  / |  \\ V /  | |        | |    \\ V / \n" +
            " | |      | |\\/| |   > <   | |        | |     > <  \n" +
            " | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n" +
            "  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n";


            String result = RomanPrinter.print(999);

            assertEquals(expected, result);
        }
    }







@Test(expected = IllegalArgumentException.class)
public void valoreIllegale() {
    try (
        MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
        utilities.when(() -> IntegerToRoman.converter(-1))
            .thenThrow(new IllegalArgumentException("is not valid"));

        RomanPrinter.print(-1);
    }
}

}
