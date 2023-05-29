class Wildcardchar
{
    public static void main(String[] args) 
    {
        String str1 = "programming";
        String str2 = "pro*ing";
        boolean isMatch = isMatchWildcard(str1, str2);
        System.out.println("Strings match: " + isMatch);
    }
    public static boolean isMatchWildcard(String str1, String str2) 
    {
        return isMatchWildcardHelper(str1, str2, 0, 0);
    }
    private static boolean isMatchWildcardHelper(String str1, String str2, int i, int j) 
    {
        if (i == str1.length() && j == str2.length()) 
        {
            return true;
        }
        if (i == str1.length() || j == str2.length()) 
        {
            return false;
        }
        if (str1.charAt(i) == str2.charAt(j) || str2.charAt(j) == '*') 
        {
            return isMatchWildcardHelper(str1, str2, i + 1, j + 1);
        }
        if (str2.charAt(j) == '*') 
        {
            return isMatchWildcardHelper(str1, str2, i + 1, j) ||isMatchWildcardHelper(str1, str2, i, j + 1);
        }
        return false;
    }
}

