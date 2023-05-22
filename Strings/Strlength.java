//using strlen()
// import java.util.*;
// import java.util.Scanner;
// class Strlength
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int length=0;
//         for(int i=0;i<str.length();i++)
//         {
//             length++;
//         }
//         System.out.println(""+length);
//     }
// }

//without strlen()
class Strlength
{
    public static void main(String[] args) 
    {
		int length=0;
        String s = "prepinsta";
        for (char ch : s.toCharArray()) 
        length++;
		System.out.println("Length of String is : "+length);
	}
}