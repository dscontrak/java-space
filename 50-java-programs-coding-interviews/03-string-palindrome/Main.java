public class Main {
    public static void main(String[] args){
        
        System.out.println("OSO is Palindrome:" + isTextPalindrome("OSO"));
        System.out.println("OSO is Palindrome:" + isTextPalindromeStringBuffer("OSO"));
        System.out.println("ABC is Palindrome:" + isTextPalindromeStringBuffer("ABC"));
    }

    public static boolean isTextPalindrome(String text){

        char[] arrayOfText = text.toCharArray();
        // length() uses for string
        char[] newText = new char[text.length()];

        // length for arrays
        for(int index = arrayOfText.length - 1, newIndex = 0; index >= 0 ; index--, newIndex++){
            newText[newIndex] = arrayOfText[index];
        }

        return text.equals(new String(newText));
    }

    public static boolean isTextPalindromeStringBuffer(String text){
        char[] arrayOfText  = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int index = arrayOfText.length - 1; index >= 0; index--){
            sb.append(arrayOfText[index]);
        }

        return text.equals(new String(sb));
    }
}