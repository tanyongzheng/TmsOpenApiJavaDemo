package openapi.tms;

//import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SignHelper {

    public static void BuildHttpRequestSinPostData(HttpPost httpPost,int userId,String apiKey,String json){
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");

        SimpleDateFormat myFmt=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date now=new Date();

        String appId = userId+"";
        String apiTime = myFmt.format(now);
        String body = json;
        String sign = appId+apiTime+body+apiKey;
        sign=MD5(sign);

        httpPost.setHeader("appId",appId);
        httpPost.setHeader("time",apiTime);
        httpPost.setHeader("sign",sign);
    }


    public static void BuildHttpRequestSinGetData(HttpGet httpGet, int userId, String apiKey){
        httpGet.setHeader("Accept", "application/json");
        httpGet.setHeader("Content-Type", "application/json");

        SimpleDateFormat myFmt=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date now=new Date();

        String appId = userId+"";
        String apiTime = myFmt.format(now);
        String sign = appId+apiTime+apiKey;
        sign=MD5(sign);

        httpGet.setHeader("appId",appId);
        httpGet.setHeader("time",apiTime);
        httpGet.setHeader("sign",sign);
    }


    private static String MD5(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            //System.out.println("MD5(" + sourceStr + ",32) = " + result);
            //System.out.println("MD5(" + sourceStr + ",16) = " + buf.toString().substring(8, 24));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;
    }

}
