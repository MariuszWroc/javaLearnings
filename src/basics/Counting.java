package basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Counting {
	public static void main(String[] args) {
		System.out.println("Liczba e " + Math.E);
		System.out.println("Liczba pi " + Math.PI);
		System.out.println("Wartoœæ bezwglêdna " + Math.abs(-10));
		System.out.println("Wartoœæ minimalna " + Math.min(10, 20));
		System.out.println("Wartoœæ maksymalna " + Math.max(10, 20));
		System.out.println("Logarytm naturalny " + Math.log(10));
		System.out.println("Logarytm z dziesieciu " + Math.log10(10));
		System.out.println("Ucina czêœæ u³amkow¹ " + Math.floor(10.5));
		System.out.println("Zaokr¹gla w górê " + Math.round(10.5));
		System.out.println("Oblicza potêge " + Math.pow(10, 3));
		System.out.println("Oblicza pierwiastek o podstawie dwa " + Math.sqrt(16));
		System.out.println("Wartoœæ sinusa " + Math.sin(100));
		System.out.println("Losuje liczbê z zakresu od 0.0 do 1.0 " + Math.random());
	
		System.out.println("Jeden: " + BigDecimal.ONE);
		System.out.println("Dwa: " + new BigDecimal(2));
		System.out.println("Dwa i pó³: " + new BigDecimal(2.5));
		System.out.println("Trzy: " + new BigDecimal("3"));
		
        System.out.println("B³¹d przy zaokr¹gleniu: " + (0.04 - 0.03));
		System.out.println("Poprawne dzia³anie: " + new BigDecimal("0.04").subtract(new BigDecimal("0.03")));
		
		System.out.println("Bez cudzys³owie: " + new BigDecimal(0.04).subtract(new BigDecimal(0.03)));
		
		long longValue = 10000000000000l;
		System.out.println("Wartoœæ zapisana jako long " + longValue);
		System.out.println("Liczba przekraczaj¹ca zakres longa " + new BigInteger("1000000000000000000000000000"));
	}
}
