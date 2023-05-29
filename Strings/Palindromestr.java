// class Palindromestr 
// {
//     public static void main(String[] args) 
//     {
//         String s = "arora";
// 		String rev = "";
// 		for (int i = s.length()-1; i >=0 ; i--) 
// 		rev=rev+s.charAt(i);
// 		if(s.equals(rev))
// 		System.out.println("String is palindrome");
// 		else 
// 		System.out.println("String is not palindrome");
//     }
// }


import java.util.*;
class Palindromestr
{
    public static void main(String args[]) 
    {
        String original = "deep", reverse = "";  
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) 
        reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
        System.out.println("Entered string is a palindrome.");
        else
        System.out.println("Entered string isn't a palindrome.");
    }
}