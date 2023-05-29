//brute force
// class Evenodd
// {
//     public static void main(String[] args) 
//     {
//         int number = 29;
//         if (number % 2 == 0)
//         System.out.println(number + " is Even");
//         else
//         System.out.println(number + " is odd");
//     }
// }


// Using Ternary Operator
// public class Evenodd
// {
//   public static void main (String[]args)
//   {
//     int number = 30;
//     String status = number % 2 == 0 ? " is Even" : " is Odd";
//       System.out.println (number + status);
//   }
// }


// Using Bitwise Operator
class Evenodd
{
  public static void main (String[]args)
  {
    int number = 29;

    if (isEven (number))
        System.out.println ("Even");
    else
        System.out.println ("Odd");
  }
  static boolean isEven (int number)
  {
    return (!(number & 1));
  }
}