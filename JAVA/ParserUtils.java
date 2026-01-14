package org.example;

public class ParserUtils {

    public static int parseIntSafe(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        } finally {
            // Ce bloc s'exécute même après un "return" dans le try ou le catch
            System.out.println("parseIntSafe finished");
        }
    }
}
