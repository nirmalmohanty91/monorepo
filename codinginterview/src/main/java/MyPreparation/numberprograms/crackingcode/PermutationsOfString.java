package MyPreparation.numberprograms.crackingcode;
/** O(n2 *n!) */
public class PermutationsOfString {

    public static void main(String[] args) {
        String s = "abc";
        permutation(s, "");
    }

    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
