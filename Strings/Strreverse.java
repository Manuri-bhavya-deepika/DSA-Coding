// class Strreverse 
// {
//     public static void main(String[] args) 
//     {
//         String s ="Prep";
//         StringBuilder sb = new StringBuilder();
//         sb.append(s);
//         System.out.println( "String is : "+sb);
//         sb.reverse();
//        System.out.println("Reversed string is : "+sb);
//     }
// }


import java.util.Scanner;
class Strreverse
{
    public static void main(String[] args) 
    {
        String s = "arora";
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) 
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}