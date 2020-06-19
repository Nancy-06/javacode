package code_practice.day_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/6/19
 */
public class Test7 {

    // 括号
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        String s = "";
        int numLeft = 0;
        int numRight = 0;
        dfs(list, s, numLeft, numRight, 2*n);
        return list;
    }

    private void dfs(List<String> list, String s, int numLeft, int numRight, int total) {
        if(s.length() == total){
            //得到一个满足条件的括号串
            String str = s;
            list.add(str);
            return;
        }

        if(2 * numLeft + 1 <= total){
            // 左括号的个数+1 <= 总括号-左括号的个数，
            // 即剩下的位置必须可以容纳足够的右括号
            dfs(list, s + "(", numLeft +1, numRight, total);
        }
        if(numRight +1 <= numLeft){
            //右括号的个数不能超过左括号的个数，可以加有括号
            dfs(list, s + ")", numLeft, numRight +1, total);
        }
    }
}
