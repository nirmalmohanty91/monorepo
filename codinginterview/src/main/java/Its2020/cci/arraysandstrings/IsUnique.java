package Its2020.cci.arraysandstrings;
/**Implement an algo to determine if a string has all unique chars*/
public class IsUnique {
    public static void main(String[] args) {
        String s = "oHelo";
        System.out.println(IsUnique.testUniqueJava7(s));
        //printAscii();
    }

    public static boolean testUniqueJava7(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        boolean isUnique = true;
        boolean[] booleanArray = new boolean[26];

        for (int i = 0; i < charArray.length; i++) {
            if (!booleanArray[charArray[i] - 97]) {
                booleanArray[charArray[i] - 97] = true;
            } else {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }


    public static void printAscii() {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = lowerCase.toUpperCase();
        char[] lowerCaseArray = lowerCase.toCharArray();
        char[] upperCaseArray = upperCase.toCharArray();
        System.out.println(lowerCaseArray);
        System.out.println(upperCaseArray);

        for (int i = 0; i < upperCaseArray.length; i++) {
            int a = upperCaseArray[i];
            System.out.print(upperCaseArray[i] + "-" + a + ", ");
        }
        System.out.println();
        for (int i = 0; i < lowerCaseArray.length; i++) {
            int a = lowerCaseArray[i];
            System.out.print(lowerCaseArray[i] + "-" + a + ", ");
        }

    }
}
