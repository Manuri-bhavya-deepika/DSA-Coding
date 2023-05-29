class Commonsubsequence
{
    public static void main(String[] args) 
    {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        int count = countCommonSubsequences(str1, str2);
        System.out.println("Number of common subsequences: " + count);
    }
    public static int countCommonSubsequences(String str1, String str2) 
    {
        int m = str1.length();
        int n = str2.length();
        return countCommonSubsequencesHelper(str1, str2, m, n);
    }
    private static int countCommonSubsequencesHelper(String str1, String str2, int m, int n) 
    {
        if (m == 0 || n == 0) 
        {
            return 0;
        } 
        else if (str1.charAt(m - 1) == str2.charAt(n - 1)) 
        {
            return 1 + countCommonSubsequencesHelper(str1, str2, m - 1, n - 1);
        } 
        else 
        {
            return countCommonSubsequencesHelper(str1, str2, m - 1, n) +countCommonSubsequencesHelper(str1, str2, m, n - 1);
        }
    }
}

