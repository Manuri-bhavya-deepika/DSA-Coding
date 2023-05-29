// import java.util.Scanner;
// class FlCapitalize 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter String : "); 
//         String s = sc.nextLine();
//         String newstr = "";
//         String[] str = s.split("\\s");
//         for (String string : str) 
//         {     
//             int length = string.length();
//             String firstchar = string.substring(0, 1);
//             String restchar = string.substring(1, length - 1);
//             String lastchar = Character.toString(string.charAt(length - 1));
//             newstr = newstr+firstchar.toUpperCase()+restchar+" ";
//         } 
//         System.out.println(newstr); 
//     }
// }



class FlCapitalize
{
    static String FirstAndLast(String str)
    {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) 
        {
            int k = i;
            while (i < ch.length && ch[i] != ' ')
            i++;
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'? ((int)ch[k] - 32): (int)ch[k]);
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'? ((int)ch[i - 1] - 32): (int)ch[i - 1]);
        }
        return new String(ch);
    }
    public static void main(String args[])
    {
        String str = "Prep insta";
        System.out.println("Input String:- "+str);
        System.out.println("String after Capitalize the first and last character of each word in a string:- "+FirstAndLast(str));
    }
}