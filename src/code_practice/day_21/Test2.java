package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/10
 */
public class Test2 {

    //URL化
    public String replaceSpaces(String S, int length) {

        char [] chars =S.toCharArray();
        int m = 0;  //有效的空格
        int j = 0;  // 替换时使用
        int n = length;
        for(int i = 0; i < n; i++){
            if(chars[i] == ' '){
                m ++;
            }
        }
        m = m*2 + n;
        char [] res = new char[m];
        for(int i = 0; i < n; i++){
            if(chars[i] == ' '){
                res[j++] = '%';
                res[j++] = '2';
                res[j++] = '0';
            }else{
                res[j++] = chars[i];
            }
        }
        return new String(res);
    }

    //字符串压缩
    public String compressString(String S) {
        if(S == null ||S.length() == 0){
            return "";
        }
        char [] chars = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        int cnt = 1;
        int index = 0;
        for(int i = 1; i < S.length(); i++){
            if(chars[i] == chars[index]){
                cnt ++;
            }else{
                sb.append(chars[index]);
                sb.append(cnt);
                index = i;
                cnt = 1;
            }
        }
        sb.append(chars[S.length() - 1]);
        sb.append(cnt);
        String res = sb.toString();
        if(res.length() >= S.length()){
            return S;
        }
        return res;
    }

    //字符串压缩（前后指针法）
    public String compressString2(String S){
        int len = S.length();
        if(S== null || len == 0){
            return S;
        }
        int last = 0;
        int front = 1;
        StringBuffer sb = new StringBuffer();
        while(front < len){
            if(S.charAt(last) != S.charAt(front)){
                sb.append(S.charAt(last));
                sb.append(front - last + "");
                last = front;
                front = front +1;
            }else{
                front ++;
            }
        }

        //最后一个相同的字符
        sb.append(S.charAt(last));
        sb.append(front - last + "");
        if(sb.toString().length() >= len){
            return S;
        }
        return sb.toString();
    }

}
