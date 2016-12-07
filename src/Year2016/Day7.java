package Year2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arenaq on 07.12.2016.
 */
public class Day7 {
    static int result;
    static int ssl;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2000; i++) {
            String line = in.readLine();
            List<String> outside = new ArrayList<>();
            List<String> brackets = new ArrayList<>();
            List<String> ABA = new ArrayList<>();
            String s = "";
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (c == '[') {
                    String t = "" + s;
                    outside.add(t);
                    s = "";
                    continue;
                }
                if (c == ']') {
                    String t = "" + s;
                    brackets.add(t);
                    s = "";
                    continue;
                }
                s += c;
            }
            outside.add(s);
            boolean hasPalindrom1 = false;
            for (String candidate : outside) {
                for (int j = 0; j < candidate.length() - 3; j++) {
                    if (candidate.charAt(j) == candidate.charAt(j + 2) && candidate.charAt(j) != candidate.charAt(j + 1)) {
                        ABA.add(""+candidate.charAt(j)+candidate.charAt(j+1)+candidate.charAt(j+2));
                    }
                    if (j == candidate.length() - 4) {
                        if (candidate.charAt(j + 1) == candidate.charAt(j + 3) && candidate.charAt(j + 1) != candidate.charAt(j + 2)) {
                            ABA.add(""+candidate.charAt(j+1)+candidate.charAt(j+2)+candidate.charAt(j+3));
                        }
                    }
                    if (candidate.charAt(j) == candidate.charAt(j + 3)
                            && candidate.charAt(j + 1) == candidate.charAt(j + 2)
                            && candidate.charAt(j) != candidate.charAt(j + 1)) hasPalindrom1 = true;
                }
            }
            boolean hasPalindrom2 = false;
            boolean aba = false;
            for (String candidate : brackets) {
                for (String three : ABA) {
                    String bab = "" + three.charAt(1) + three.charAt(0) + three.charAt(1);
                    if (candidate.contains(bab)) {
                        aba = true;
                    }
                }
                for (int j = 0; j < candidate.length() - 3; j++) {
                    if (candidate.charAt(j) == candidate.charAt(j + 3)
                            && candidate.charAt(j + 1) == candidate.charAt(j + 2)
                            && candidate.charAt(j) != candidate.charAt(j + 1)) hasPalindrom2 = true;
                }
            }
            if (hasPalindrom1 && !hasPalindrom2) {
                result++;
            }
            if (aba) {
                ssl++;
            }
        }
        System.out.println(result);
        System.out.println(ssl);
    }
}
