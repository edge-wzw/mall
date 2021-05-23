package day2_821;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/10 16:41
 * @Version 1.0
 */
public class Solution {
    public static int[] shortestToChar(String s, char c) {
        int l, r;
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                l = r = i;
                while (l > 0 && (s.charAt(l) != c)){
                    l--;
                }
                while (r < s.length()-1 && (s.charAt(r) != c)){
                    r++;
                }
                if (s.charAt(l) != c){
                    res[i] = Math.abs(i - r);
                }else if (s.charAt(r) != c){
                    res[i] = Math.abs(i - l);
                }else {
                    res[i] = Math.min(Math.abs(i - l), Math.abs(i - r));
                }
            }else {
                res[i] = 0;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        String s = "aaba";
        char c = 'b';
        int[] res = shortestToChar(s, c);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
