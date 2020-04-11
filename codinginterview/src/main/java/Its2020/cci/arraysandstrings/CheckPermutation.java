package Its2020.cci.arraysandstrings;

import utils.Utility;

import java.util.Arrays;

/**
 * Given two strings, check if one is permutation of other
 */
public class CheckPermutation {
    public static void main(String[] args) {

        String s1 = "nirmal";
        String s2 = "lnirma";
        System.out.println(isPermutation(s1, s2));
    }

    public static boolean isPermutation(String s1, String s2) {
        char[] s1Chars = s1.toLowerCase().toCharArray();
        char[] s2Chars = s2.toLowerCase().toCharArray();
        boolean permutation = false;

        int[] b = new int[26];
        Utility.printArray(b);
        for (int i = 0; i < s1Chars.length; i++) {
            b[s1Chars[i] - 'a'] = b[s1Chars[i] - 'a'] + 1;
        }

        Utility.printArray(b);
        for (int i = 0; i < s2Chars.length; i++) {
            if (b[s2Chars[i] - 'a'] > 0) {
                b[s2Chars[i] - 'a'] = b[s2Chars[i] - 'a'] - 1;
            }
        }

        Utility.printArray(b);
        System.out.println(!Arrays.stream(b).filter(x -> x > 0 || x < 0).findAny().isPresent());
        if (!Arrays.stream(b).filter(x -> x > 0 || x < 0).findAny().isPresent()) {
            permutation = true;
        }
        return permutation;
    }
}
