package basics;

import java.security.SecureRandom;
import java.util.Date;

public class MyRandom {

    private static int n = 1;

    private static String generateId() {

        // id generator same as in ui
        return "groupParam" + (long) Math.floor(Math.random() * 10000) + "-" + new Date().getTime() + n++;
    }

    private static String generateSecureId() {

        SecureRandom random = new SecureRandom();
        // id generator same as in ui
        return "groupParam" + (long) Math.floor(random.nextInt(1000)) + "-" + new Date().getTime() + n++;
    }

    public static void main(String[] args) {

        for (int i = 1; i < 100001; i++) {
            System.out.println(generateId());
            System.out.println(generateSecureId());
            System.out.println();
        }
    }
}
