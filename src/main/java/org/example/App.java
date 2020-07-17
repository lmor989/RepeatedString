package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static long repeatedString(String s, long n) {
        long stringRepeated = n / s.length();
        long leftOver = n % s.length();
        String leftOverString = s.substring(0, (int) leftOver);
        int leftOvers = 0;
        for (int i = 0; i < leftOverString.length(); i++) {
            if (s.charAt(i) == 'a') {
                leftOvers++;
            }
        }
        long letterRepeated = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                letterRepeated++;
            }
        }
        return letterRepeated * stringRepeated + leftOvers;
    }
}
