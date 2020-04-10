package Its2020.cci.arraysandstrings;

public class IsUnique {
    public static void main(String[] args) {
        String s = "oHelo";
        System.out.println(IsUnique.testUnique(s));
    }

    public static boolean testUnique(String s) {
        boolean[] array1 = new boolean[26];
        char[] charArray = s.toLowerCase().toCharArray();
        boolean isUnique = true;
        for (int i = 0; i < charArray.length; i++) {
            if (!array1[charArray[i] - 97]) {
                array1[charArray[i] - 97] = true;
            } else {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
