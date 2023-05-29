import java.util.Scanner;
public class Substrreplace
{
public static void main(String[] args) 
{
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter original String : ");
     String s1 = sc.nextLine();
     System.out.print("Enter the SubString to be replaced : ");
     String oldSubstr = sc.nextLine();
     System.out.print("Enter the new SubString : ");
     String newSubstr =sc.nextLine();
     String modifiedString = s1.replace(oldSubstr, newSubstr);
     System.out.println("New String is :"+modifiedString);
   }
}


// public class Substrreplace
// {
//     public static void main(String[] args) 
//     {
//         String originalString = "The quick brown fox jumps over the lazy dog.";
//         String oldSubstring = "lazy";
//         String newSubstring = "energetic";
//         String modifiedString = originalString.replace(oldSubstring, newSubstring);
//         System.out.println("Original String: " + originalString);
//         System.out.println("Modified String: " + modifiedString);
//     }
// }
