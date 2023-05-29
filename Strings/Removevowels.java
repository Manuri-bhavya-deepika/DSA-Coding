// class Removevowels 
// {
//     public static void main(String[] args) 
//     {
//         String s = "deepu";
//         String s1 = "";
//         s1 = s.replaceAll("[aeiou]", ""); 
//         System.out.println("String after removing vowel : "+s1); 
// 	}
// }


import java.util.Arrays;
import java.util.List;
class Removevowels
{
    static String remVowel(String str) 
    {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    public static void main(String[] args) 
    {
        String str = "bhavya";
        System.out.println(remVowel(str));
    }
}