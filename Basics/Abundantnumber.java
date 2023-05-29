// class Abundantnumber 
// {
//     public static void main (String[]args)
//     {
//         int n = 12, sum = 0;
//         for (int i = 1; i < n; i++) 
//         { 
//             if (n % i == 0) 
//             sum = sum + i; 
//         } 
//         if (sum > n)
//         {
//             System.out.println (n + " is an Abundant Number");
//             System.out.println ("The Abundance is: " + (sum - n));
//         }
//         else
//         System.out.println (n + " is not an Abundant Number");
//     }
// }


class Abundantnumber
{
    public static void main (String[]args)
    {
        int n = 12; 
        int sum = getSum(n); 
        if(sum > n)
        {
            System.out.println (n + " is an Abundant Number");
            System.out.println ("The Abundance is: " + (sum - n));
        }
        else
        System.out.println (n + " is not an Abundant Number");
    }
    static int getSum(int n)
    {
        int sum = 0;
        for(int i = 1; i < Math.sqrt(n); i++) 
        { 
            if (n % i == 0) 
            { 
                if(i == 1) 
                sum = sum + i;
                else if(i == n/i) 
                sum = sum + i;
                else 
                sum = sum + i + n/i; 
            } 
        } 
        return sum; 
    } 
}
