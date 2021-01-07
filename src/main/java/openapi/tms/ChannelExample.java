package openapi.tms;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ChannelExample {

    public static void GetAllChannel(){
        //HttpClient client=new DefaultHttpClient();
        String url=APIConfig._APIURL+"Channel/GetAll";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        SignHelper.BuildHttpRequestSinGetData(httpGet,APIConfig._UserId,APIConfig._APIKey);
        CloseableHttpResponse response=null;
        try {
            response =  httpClient.execute(httpGet);
            /**请求发送成功，并得到响应**/
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                String strResult = EntityUtils.toString(response.getEntity());
                System.out.println("返回数据：");
                System.out.println(strResult);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
