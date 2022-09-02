/*
 * Hikaru Yamamoto
 * 04 2, 2020
 * CS170
 */

public class YourCode {
    public YourCode(){}
    
    // prints out letter in the middle in the string
    public static void sectionA(String str) {
        int length = str.length() / 2;
        System.out.println(str.substring(0,length));
    }
    
    // prints out the string without first letter
    public static void sectionB(String str) {
        int length = str.length();
        System.out.println(str.substring(1,length - 1));
    }
    
    // prints out the combied string, shorter word first, longer word next
    public static void sectionC(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 < length2)
            System.out.println(str1.concat(str2).concat(str1));
        else
            System.out.println(str2.concat(str1).concat(str2));
    }
    
    // prints out the combined string, without the first letter of each word
    public static void sectionD(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println(str1.substring(1, length1) + str2.substring(1, length2));
    }

    // prints out the string, starting from 3rd letter
    public static void sectionE(String str) {
        int length = str.length();
        System.out.println(str.substring(2, length).concat(str.substring(0, 2)));
    }
    
    // prints out the middle part of the string
    public static void sectionF(String str) {
        int length = str.length() / 2;
        System.out.println(str.substring(length - 1, length + 1));
    }
    
    // prints out how many "hi" the string contains
    public static void sectionG(String str) {
        int length = str.length();
        int count = 0;
        for (int i = 0; i + 2 <= length; i++) {
            if (str.substring(i, i + 2).equals("hi"))
            count++;
        }
        System.out.println(count);
    }
}
