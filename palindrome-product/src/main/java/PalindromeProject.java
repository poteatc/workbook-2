import java.util.ArrayList;

public class PalindromeProject {
    public static void main(String[] args) {
        /* The largest palindrome made from the product of two 2-digit numbers is 9009
        * 91 x 99 = 9009
         */
        ArrayList<String> palindromes = new ArrayList<>();
        int largestThreeDigitNumber = 999;
        for (int i = 100; i < largestThreeDigitNumber + 1; i++) {
            int product = 0;
            for (int j = 100; j < largestThreeDigitNumber + 1; j++) {
                product = i * j;
                String productAsString = String.valueOf(product);

                if (productAsString.equals(reverseString(productAsString))) {
                    palindromes.add(productAsString);
                }
            }
        }
        //System.out.println(palindromes);
        System.out.println("The largest palindrome as a product of 3 digits is: " + palindromes.get(palindromes.size() - 1));
    }

    public static String reverseString(String s) {
        // convert String to character array
        // by using toCharArray
        char[] charArray = s.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return reversed;
    }
}
