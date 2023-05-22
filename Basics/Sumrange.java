// Using Brute Force
// class Sumrange 
// {
//     public static void main (String[]args)
//     {
//       int a = 5;
//       int b = 10;
//       int sum = 0;
//       for (int i = a; i <= b; i++)
//       sum = sum + i;
//       System.out.println ("The sum is " + sum);
//     }
// }

//  Using the Formula
// class Sumrange
// {
// 	public static void main(String[] args) 
//     {
// 	    int num1 = 2;
// 	    int num2 = 5;
// 	    int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
// 		System.out.println("The Sum is "+ sum);
// 	}
// }


// Using Recursion
class Sumrange
{
    public static void main (String[]args)
    {
        int a = 5;
        int b = 10;
        int sum = getSum (0, a, b);        
        System.out.println ("The sum is " + sum);
    }
    static int getSum (int sum, int i, int b)
    {
        if (i > b)
        return sum;
        return i + getSum (sum, i + 1, b);
    }
}
