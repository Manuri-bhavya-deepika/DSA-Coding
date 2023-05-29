// with builtin
// class Removespaces 
// {
//     public static void main(String[] args)
//     {
//         StringBuffer sb = new StringBuffer();
//         String s = "Prepinsta is best";
//         String[] s1 = s.split("[\\s]");
//         for (String string : s1) 
//         {
//             sb.append(string);
// 	    }
//         System.out.println(sb);
//     }
// }


// without inbuilt
import java.util.Scanner;
class Removespaces
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String s = "Prep is best";
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) 
        {
            if( (c[i] != ' ') && (c[i]!= '\t' )) 
            {
                sb.append(c[i]);
	        }    	
        }
        System.out.println("String after removing spaces : "+sb);
    }
}
