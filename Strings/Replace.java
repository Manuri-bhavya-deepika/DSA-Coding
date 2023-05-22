//Brute force approach
// class Replace 
// {
//     static void remove(String str, String word) 
//     {
//         String msg[] = str.split(" "); 
//         String new_str = "";
//         for (String words : msg)
//         {
//             if (!words.equals(word)) 
//             {
//                 new_str += words + " ";
//             }
//         }
//         System.out.print(new_str);
//     }
//     public
//     static void main(String[] args) 
//     {
//         String str = "This is the javacode";
//         String word = "the";
//         remove(str, word);
//     }
// }


//replaceall()
class Replace
{
    public static void main(String[] args)
    {
        String str = "This is the javacode";
        String word = "the";
        str = str.replaceAll("the", "");
        str = str.trim();
        System.out.print(str);
    }
}

//msg is an array of string type.
//The code splits the input string "This is the prepinsta" into an array of strings using space (" ") as a delimiter. 
// The resulting array of strings is:
// msg[0] = "This"
// msg[1] = "is"
// msg[2] = "the"
// msg[3] = "prepinsta"
//these are stored in words
