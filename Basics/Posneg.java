// brute force
// class Posneg 
// {
//     public static void main (String[]args)
//     {
//         int num = 5;
//         if (num > 0)
//         System.out.println ("The number is positive");
//         else if (num < 0)
//         System.out.println ("The number is negative");
//         else
//         System.out.println ("Zero");
//     }
// }


// nested-if
// class Posneg
// {
//   public static void main (String[]args)
//   {
//     int num = 5;
//     if (num >= 0)
//     {
//         if (num == 0)
//             System.out.println ("Zero");
//         else
//             System.out.println ("The number is positive");
//     }
//     else
//         System.out.println ("The number is negative");
//     }
// }


//Using Ternary Operator
class Posneg
{
  public static void main (String[]args)
  {

    int num = 0;
    if (num == 0)
      {
	    System.out.println ("Zero");
      }
      
    else{
        String result = num > 0 ? "The number is positive" : "The number is negative";
        System.out.println (result);
    }
  }
}