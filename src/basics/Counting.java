package basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Counting {
	public static void main(String[] args) {
		System.out.println("Liczba e " + Math.E);
		System.out.println("Liczba pi " + Math.PI);
		System.out.println("Warto�� bezwgl�dna " + Math.abs(-10));
		System.out.println("Warto�� minimalna " + Math.min(10, 20));
		System.out.println("Warto�� maksymalna " + Math.max(10, 20));
		System.out.println("Logarytm naturalny " + Math.log(10));
		System.out.println("Logarytm z dziesieciu " + Math.log10(10));
		System.out.println("Ucina cz�� u�amkow� " + Math.floor(10.5));
		System.out.println("Zaokr�gla w g�r� " + Math.round(10.5));
		System.out.println("Oblicza pot�ge " + Math.pow(10, 3));
		System.out.println("Oblicza pierwiastek o podstawie dwa " + Math.sqrt(16));
		System.out.println("Warto�� sinusa " + Math.sin(100));
		System.out.println("Losuje liczb� z zakresu od 0.0 do 1.0 " + Math.random());
	
		System.out.println("Jeden: " + BigDecimal.ONE);
		System.out.println("Dwa: " + new BigDecimal(2));
		System.out.println("Dwa i p�: " + new BigDecimal(2.5));
		System.out.println("Trzy: " + new BigDecimal("3"));
		
        System.out.println("B��d przy zaokr�gleniu: " + (0.04 - 0.03));
		System.out.println("Poprawne dzia�anie: " + new BigDecimal("0.04").subtract(new BigDecimal("0.03")));
		
		System.out.println("Bez cudzys�owie: " + new BigDecimal(0.04).subtract(new BigDecimal(0.03)));
		
		long longValue = 10000000000000l;
		System.out.println("Warto�� zapisana jako long " + longValue);
		System.out.println("Liczba przekraczaj�ca zakres longa " + new BigInteger("1000000000000000000000000000"));
	}
}
