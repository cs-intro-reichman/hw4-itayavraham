public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                ascii = (int)str.charAt(i);
                newStr += (char)(ascii+32);
            }
            else
            newStr += str.charAt(i);
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        // Edge Case :
        if (str2.length() > str1.length())
        return false;

        boolean flag = false;
        int i2 = 1;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                i2 = i+1;
                if (i2 + str2.length() - 1 <= str1.length()) // Out of Bounds Case Check
                for (int j = 1; j < str2.length(); j++) {
                    if (str1.charAt(i2) != str2.charAt(j)) {
                     flag = false;
                     break;   
                    }
                    i2 += 1;
                    flag = true;
                }
                if (flag)
                return true;

            }
        }
        return false;
    }
}
