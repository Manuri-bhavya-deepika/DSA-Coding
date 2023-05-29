import java.util.Arrays;
class Lexographicallysorted 
{
    public static void main(String[] args) 
    {
        String str = "abc";
        System.out.println("Permutations in lexicographically sorted order:");
        printSortedPermutations(str);
    }
    public static void printSortedPermutations(String str) 
    {
        char[] chars = str.toCharArray();
        Arrays.sort(chars); 
        str = new String(chars);
        boolean[] used = new boolean[str.length()];
        StringBuilder sb = new StringBuilder();
        generatePermutations(str, used, sb);
    }
    private static void generatePermutations(String str, boolean[] used, StringBuilder sb) 
    {
        if (sb.length() == str.length()) 
        {
            System.out.println(sb.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) 
        {
            if (!used[i]) 
            {
                used[i] = true;
                sb.append(str.charAt(i));
                generatePermutations(str, used, sb);
                used[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}

