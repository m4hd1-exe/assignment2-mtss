package it.unipd.mtss;

public class IntegerToRoman {
    public static String converter(int num) throws IllegalArgumentException{
        if(num < 1 || num > 1000){
            throw new IllegalArgumentException(num + " is not a valid number");
        }
        String ris = "";
        while(num >= 1000){
            ris += "M";
            num -= 1000;
        }
        while(num >= 900){
            ris += "CM";
            num -= 900;
        }
        while(num >= 500){
            ris += "D";
            num -= 500;
        }
        while(num >= 400){
            ris += "CD";
            num -= 400;
        }
        while(num >= 100){
            ris += "C";
            num -= 100;
        }
        while(num >= 90){
            ris += "XC";
            num -= 90;
        }
        while(num >= 50){
            ris += "L";
            num -= 50;
        }
        while(num >= 40){
            ris += "XL";
            num -= 40;
        }
        while(num >= 10){
            ris += "X";
            num -= 10;
        }
        while(num >= 9){
            ris += "IX";
            num -= 9;
        }
        while(num >= 5){
            ris += "V";
            num -= 5;
        }
        while(num >= 4){
            ris += "IV";
            num -= 4;
        }
        while(num >= 1){
            ris += "I";
            num -= 1;
        }
        return ris;
    }    
}
