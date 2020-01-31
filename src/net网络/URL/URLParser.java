package net网络.URL;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/1/29
 */
//URL（网址)的分割
public class URLParser {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Map<String,Integer> allKnowPorts=new HashMap<>();
        allKnowPorts.put("http",80);
        allKnowPorts.put("https",443);

        String url="https://www.baidu.com/s?wd=C%2B%2B&" +
                "rsv_spt=1&rsv_iqid=0xdf53badc00021191&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&" +
                "tn=06074089_36_pg&rsv_enter=1&rsv_dl=tb&rsv_sug3=3&rsv_sug1=3&" +
                "rsv_sug7=100&rsv_sug2=0&inputT=1773&rsv_sug4=1773";
       int i;
        //获取schema
        i= url.indexOf("://");
        String scema=url.substring(0,i);
        System.out.println(scema);

        //获取host+port
        url=url.substring(i+3);
        i=url.indexOf("/");
        String hostAndPort=url.substring(0,i);
        String host;
        int port;
        if(hostAndPort.contains(":")){
            String [] group=hostAndPort.split(":");
            host=group[0];
            //字符串转为数字
            port= Integer.parseInt(group[1]);
        }
        else{
            host=hostAndPort;
            port=allKnowPorts.get(scema);
        }
        System.out.println(host);
        System.out.println(port);


        //找path
        url=url.substring(i);
        i=url.indexOf("?");
        String path=url.substring(0,i);
        System.out.println(path);

        //区分query—String 和sement
        if(i!=-1){
            String queryString;
            url=url.substring(i+1);
            String [] group=url.split("#");
            queryString=group[0];
            if(group.length==2){
                System.out.println(group[0]);
            }
            String [] kvGroup=queryString.split("&");
            for(String kv:kvGroup){
                int index=kv.indexOf("=");
                String key= URLDecoder.decode(kv.substring(0,index),"UTF-8");
                String value=URLDecoder.decode(kv.substring(index+1));
                System.out.println(key);
                System.out.println(value);
                System.out.println("==========================================");
            }
        }
    }
}
