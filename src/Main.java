import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("HelloWorld");

        String name = "Mallory";
        int gallonsUsed = 8000;
        int customerType = 1; //1=single family andd 2 = doubl family
        double bill = 0.0;

        if (customerType == 1) {
            if (gallonsUsed <= 7000) {
                bill = 13.21 + gallonsUsed * (2.04 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = 13.21 + 7000 * (2.04 / 1000.0)
                        + (gallonsUsed - 7000) * (2.35 / 1000.0);
            } else {
                bill = 13.21 + 7000 * (2.04 / 1000.0)
                        + 6000 * (2.35 / 1000.0)
                        + (gallonsUsed - 13000) * (2.70 / 1000.0);
            }
        } else {
            if (gallonsUsed <= 7000) {
                bill = 15.51 + gallonsUsed * (1.97 / 1000.0);
            } else if (gallonsUsed <= 13000) {
                bill = 15.51 + 9000 * (1.97 / 1000.0)
                        + (gallonsUsed - 9000) * (2.26 / 1000.0);
            } else {
                bill = 15.51 + 9000 * (1.97 / 1000.0)
                        + 4000 * (2.26 / 1000.0)
                        + (gallonsUsed - 13000) * (2.60 / 1000.0);
            }
        }

        System.out.println("The bill is " + bill);
    }
}
