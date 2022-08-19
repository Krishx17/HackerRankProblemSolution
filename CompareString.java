public class CompareString {
  
    // This method compares two strings
    // lexicographically without using
    // library functions
    public static int stringCompare(String str1,
                                    String str2)
    {
        for (int i = 0; i < str1.length() && 
                    i < str2.length(); i++) {
            if ((int)str1.charAt(i) == 
                (int)str2.charAt(i)) {
                continue;
            } 
            else {
                return (int)str1.charAt(i) - 
                    (int)str2.charAt(i);
            }
        }
  
        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        } 
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }
          
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
} 
