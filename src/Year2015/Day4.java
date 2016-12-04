package Year2015;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Petr Kuška
 */
public class Day4 {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String password = "ckczppom";
        MessageDigest md = MessageDigest.getInstance("MD5");

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            String s = password + String.valueOf(i);
            md.update(s.getBytes());
            byte byteData[] = md.digest();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < byteData.length; j++) {
                sb.append(Integer.toString((byteData[j] & 0xff) + 0x100, 16).substring(1));
            }
            if (sb.toString().substring(0, 5).compareTo("00000") == 0) {
                System.out.println(i);
                break;
            }
            md.reset();
        }
    }

}
