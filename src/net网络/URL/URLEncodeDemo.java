package net网络.URL;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//编码与解码
public class URLEncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="c++";
        //编码
        String r=URLEncoder.encode(s,"UTF-8");
        System.out.println(r);
        //解码
        s= URLDecoder.decode(r,"UTF-8");
        System.out.println(s);
    }
}
