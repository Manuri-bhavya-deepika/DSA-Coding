//if-else
// class Leap 
// {
//     public static void main (String[]args)
//     {
//         int year = 2023;
//         if (year % 400 == 0)
//         System.out.println (year + " is a Leap Year");
//         else if (year % 4 == 0 && year % 100 != 0)
//         System.out.println (year + " is a Leap Year");
//         else
//         System.out.println (year + " is not a Leap Year");
//     }
//  }


//if-else
// public class Leap
//  {
//    public static void main (String[]args)
//    {
//     int year = 2023;
//     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//        System.out.println (year + " is a Leap Year");
//     else
//     System.out.println (year + " is not a Leap Year");
//    }
//  }


//Using Ternary Operator
// public class Leap
// {
//   public static void main (String[]args)
//   {
//     int year = 2020;
//     int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
//     if (flag ==1)
//     {
//         System.out.println (year + " is a Leap Year");
//     }
//     else
//     {
//          System.out.println (year + " is not a Leap Year");
//     }
//   }
// }


// Bonus Boolean Method
class Leap
{
    public static void main(String[] args) 
    {
        int year = 2020;
        boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}