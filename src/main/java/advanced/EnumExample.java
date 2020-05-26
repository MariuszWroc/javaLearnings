package advanced;

public class EnumExample {
	 
    public enum Odpowiedz {
        TAK(true),
        NIE(false),
        T(true),
        N(false),
        YES(true),
        NO(false),
        OK(true),
        SURE(true),
        NOPE(false);
 
        private boolean wartosc;
 
        private Odpowiedz(boolean wartosc) {
            this.wartosc = wartosc;
        }
 
        public boolean getWartosc() {
            return wartosc;
        }
    }
 
    public static void main(String[] args) {
 
    	EnumExample test = new EnumExample();
        String[] wartosciUsera = {"tak", "TAK", "OK", "ta", "nie", "niewiem", "NoPe" };
 
        test.simplePrint("==WEJSCIE==");
        test.simplePrint("-----------");
 
        for(String wejscie : wartosciUsera) {
 
            test.simplePrint(test.odpUsera(wejscie));    
        }   
    }
 
    public String odpUsera(String wejscie) {
        for(Odpowiedz odp : Odpowiedz.values()) {
            if(odp.toString().equalsIgnoreCase(wejscie))
                return odp.toString();
        }
		return Boolean.toString(false);
    }
 
    private void simplePrint(String one) {
        System.out.printf("%15s  |  %10s\n", one);
    }
 
}
