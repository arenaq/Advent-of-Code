package Year2016;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by arenaq on 05.12.2016.
 */
public class Day5 {
    public static void main(String[] args) {
        long number = 0;
        String input = "abbhdwsy";
        String result = "";
        char[] result2 = new char[8];
        while (!isFilled(result2)) {
            String s = input + number;
            String md5 = MD5(s);
            number++;
            while (!check(md5)) {
                s = input + number;
                md5 = MD5(s);
                number++;
            }
            if (result.length() < 8) result += md5.charAt(5);
            int index = Character.getNumericValue(md5.charAt(5));
            if (index > 7 || index < 0) continue;
            if (result2[index] == 0) {
                result2[index] = md5.charAt(6);
                System.out.print(".");
            }
        }
        System.out.println(result);
        System.out.println(result2);
    }

    static boolean isFilled(char[] r) {
        for (int i = 0; i < r.length; i++) {
            if (r[i] == 0) return false;
        }
        return true;
    }

    static boolean check(String s) {
        for (int i = 0; i < 5; i++) {
            if (s.charAt(i) != '0') return false;
        }
        return true;
    }

    static String MD5(String input) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(input.getBytes( "UTF-8" ));
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append( String.format( "%02x", array[i]));
            }
            return sb.toString();
        } catch ( NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return null;
        }
    }
}
