package NUMBER;
import java.util.Arrays;

public class Anagram {
    
   
    public static boolean areAnagrams(String str1, String str2) {
      
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

       
        Arrays.sort(arr1);
        Arrays.sort(arr2);

       
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
       
        String input1 = "listen";
        String input2 = "silent";

       
        if (areAnagrams(input1, input2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        
        input1 = "hello";
        input2 = "world";

      
        if (areAnagrams(input1, input2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}
