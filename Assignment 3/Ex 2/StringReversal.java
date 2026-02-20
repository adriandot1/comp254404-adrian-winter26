import java.util.Scanner;

class StringReversal{

public static boolean isPalindrome(String s){
    if(s.length() <= 1){
        System.out.println("Yes this word is a Palindrome");
        return true; 
    }
    if(s.charAt(0) != s.charAt(s.length() - 1)){
        System.out.println("No this is not a Palindrome");
        return false;
    }
    return isPalindrome(s.substring(1, s.length() - 1));
}

public static void main(String[] args){

    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a word: "); 
    String word = input.nextLine();
    
    System.out.println(isPalindrome(word));
}

}