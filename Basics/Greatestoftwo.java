//Using if-else Statements
// class Greatestoftwo
// {
//     public static void main (String[]args)
//     {
//         int num1 = 50, num2 = 20;
//         if (num1 == num2)
//         System.out.println ("both are equal");
//         else if (num1 > num2)
//         System.out.println (num1 + " is greater");
//         else
//         System.out.println (num2 + " is greater");
//     }
// }

// Using Ternary Operator
// class Greatestoftwo
// {
//   public static void main (String[]args)
//   {
//     int num1 = 50, num2 = 10, temp;
//     if (num1 == num2)
//       System.out.println ("Both are Equal\n");
//     else
//     {
//         temp = num1 > num2 ? num1 : num2;
//         System.out.println (temp + " is largest");
//     }
//   }
// }


// Using inbuilt max Function
class Greatestoftwo 
{
    public static void main(String args[])
    {
        int num1 = 12, num2 = 21;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            System.out.println(Math.max(num1, num2) + " is greater");
    }
}
