package code_practice.day_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/7/1
 */
public class Test15 {

    //括号生成
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int left, int right, String s) {
        if(left == 0 && right == 0){
            res.add(s);
            return;
        }
        //如果左括号剩余的话，可以拼接左括号
        if(left > 0){
            dfs(left - 1, right, s + "(");
        }
        //如果右括号剩余多于左括号的话，可以拼接右括号
        if(right > left){
            dfs(left, right-1, s + ")");
        }
    }
}
