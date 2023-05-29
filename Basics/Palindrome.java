// Using Iteration
// class Palindrome 
// {
//     public static void main (String[]args)
//     {
//         int num = 12021, reverse = 0, rem, temp;
//         temp = num;
//         while (temp != 0)
//         {
//             rem = temp % 10;
//             reverse = reverse * 10 + rem;
//             temp /= 10;
//         }
//         if (num == reverse)
//         System.out.println (num + " is Palindrome");
//         else
//         System.out.println (num + " is not Palindrome");
//     }
// }


// Using Recursion
class Palindrome
{
    public static void main (String[]args)
    {
        int num = 12021, reverse = 0, rem, temp;
        if (getReverse(num, reverse) == num)
        System.out.println (num + " is Palindrome");
        else
        System.out.println (num + " is not Palindrome");
    }
    static int getReverse(int num, int rev)
    {
        if(num == 0)
        return rev;
        int rem = num % 10;
        rev = rev * 10 + rem;
        return getReverse(num / 10, rev);
    }
}
