// class VC
// {
//     public static void main(String[] args)
//     {
//         char c = 'g';     
//         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//         {
//             System.out.println(c + " is a vowel ");
//         }
//         else
//         {
//             System.out.println(c + " is a consonant ");
//         }
//     }
// }


// class VC
// {
//     public static void main (String[]args)
//     {
//         char c = 'f';
//         if (isLowercaseVowel (c) || isUppercaseVowel (c))
//             System.out.println (c + " is a vowel ");
//         else
//             System.out.println (c + " is a consonant ");
//     }
//     static boolean isLowercaseVowel (char c)
//     {
//         return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
//     }
//     static boolean isUppercaseVowel (char c)
//     {
//         return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
//     }

// }


class Vc
{
    public static void main (String[]args)
    {
        char c = 'f';
        if (isVowel(c))
            System.out.println (c + " is a vowel ");

        else
            System.out.println (c + " is a consonant ");
    }
    static boolean isVowel(char c)
    {
        c = Character.toUpperCase(c);
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}