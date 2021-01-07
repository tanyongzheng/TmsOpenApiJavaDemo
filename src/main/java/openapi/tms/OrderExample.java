package openapi.tms;

import openapi.tms.dtos.CheckAddressInput;
import openapi.tms.dtos.CreateOrderDetailInput;
import openapi.tms.dtos.CreateOrderMainInput;
import openapi.tms.dtos.CreateOrderPackageInput;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;

public class OrderExample {


    public static void GetTrackNo() {
        String url = APIConfig._APIURL + "Order/GetTrackNo?code=20210104test02";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        SignHelper.BuildHttpRequestSinGetData(httpGet,APIConfig._UserId,APIConfig._APIKey);
        CloseableHttpResponse response=null;
        try {
            response =  httpClient.execute(httpGet);
            String strResult = null;
            try {
                strResult = EntityUtils.toString(response.getEntity());
            } catch (IOException e) {
                e.printStackTrace();
            }
            /**请求发送成功，并得到响应**/
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                System.out.println("通过订单号获取订单信息返回数据：");
            }else{
                System.out.println("状态码："+response.getStatusLine().getStatusCode());
                System.out.println("错误信息：");
            }
            System.out.println(strResult);
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


    public static void CheckAddress(){
        String jsonParams=CheckAddressModelToJson();
        String url = APIConfig._APIURL + "Order/CheckAddress";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        SignHelper.BuildHttpRequestSinPostData(httpPost,APIConfig._UserId,APIConfig._APIKey,jsonParams);
        String charSet = "UTF-8";
        StringEntity entity = new StringEntity(jsonParams, charSet);
        httpPost.setEntity(entity);
        CloseableHttpResponse response=null;
        try {
            response =  httpClient.execute(httpPost);
            String strResult = EntityUtils.toString(response.getEntity());
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                System.out.println("地址验证返回数据：");
            }else{
                System.out.println("状态码："+response.getStatusLine().getStatusCode());
                System.out.println("错误信息：");
            }
            System.out.println(strResult);
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

    public static void CreateOrder(){
        String jsonParams=CreateOrderModelToJson();
        String url = APIConfig._APIURL + "Order/CreateOrder";
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        SignHelper.BuildHttpRequestSinPostData(httpPost,APIConfig._UserId,APIConfig._APIKey,jsonParams);
        String charSet = "UTF-8";
        StringEntity entity = new StringEntity(jsonParams, charSet);
        httpPost.setEntity(entity);
        CloseableHttpResponse response=null;
        try {
            response =  httpClient.execute(httpPost);
            String strResult = EntityUtils.toString(response.getEntity());
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                System.out.println("创建订单返回数据：");
            }else{
                System.out.println("状态码："+response.getStatusLine().getStatusCode());
                System.out.println("错误信息：");
            }
            System.out.println(strResult);
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

    // private method
    private static String CheckAddressModelToJson(){

        CheckAddressInput entity = new CheckAddressInput();

        entity.setChannelCode("USPSABC1");  // 渠道代码
        entity.setToCountryCode("US");
        entity.setToName("Mr Lee");
        entity.setToCompany("Test Company");
        entity.setToContact("13800138000");
        entity.setToProvince("FL");;
        entity.setToCity("Naples");
        entity.setToPostCode("34105");
        entity.setToAddress1("6859 Del Mar Terrace");
        entity.setToAddress2("");
        String json= JSON.toJSONString(entity);

        return json;
    }

    private static String CreateOrderModelToJson(){

        CreateOrderMainInput entity = new CreateOrderMainInput();

        entity.setReferCode("A11111111111");
        entity.setChannelCode("USPSABC1");  // 渠道代码
        entity.setToCountryName("US");
        entity.setToName("Mr Lee");
        entity.setToCompany("Test Company");
        entity.setToContact("13800138000");
        entity.setToProvince("FL");;
        entity.setToCity("Naples");
        entity.setToPostCode("34105");
        entity.setToAddress1("6859 Del Mar Terrace");
        entity.setToAddress2("");
        entity.setWeight(0.345);

        CreateOrderPackageInput orderPackage=new CreateOrderPackageInput();

        orderPackage.setLength(2);
        orderPackage.setWidth(3);
        orderPackage.setHeight(4);
        orderPackage.setWeight(0.345);
        orderPackage.setCount(1);
        orderPackage.setParcelCode("A11111111111");


        ArrayList orderDetailList=new ArrayList<CreateOrderDetailInput>();

        CreateOrderDetailInput orderDetail1=new CreateOrderDetailInput();
        orderDetail1.setReferNo( "SKU001") ;
        orderDetail1.setCnDesc("包包") ;
        orderDetail1.setEnDesc("bag") ;
        orderDetail1.setSalesPrice(0.123) ;
        orderDetail1.setCustomcCode("1111111111") ;
        orderDetail1.setProductCount(1);
        orderDetail1.setProductWeight(0.02) ;

        CreateOrderDetailInput orderDetail2=new CreateOrderDetailInput();
        orderDetail2.setReferNo( "SKU002") ;
        orderDetail2.setCnDesc("手机壳") ;
        orderDetail2.setEnDesc("phone cell") ;
        orderDetail2.setSalesPrice(0.234) ;
        orderDetail2.setCustomcCode("2222222222") ;
        orderDetail2.setProductCount(1);
        orderDetail2.setProductWeight(0.03) ;

        orderDetailList.add(orderDetail1);
        orderDetailList.add(orderDetail2);

        orderPackage.setOrderDetails(orderDetailList);

        ArrayList<CreateOrderPackageInput> orderPackageList=new ArrayList<CreateOrderPackageInput>();
        orderPackageList.add(orderPackage);
        entity.setOrderPackages(orderPackageList);

        String json= JSON.toJSONString(entity);

        return json;
    }
}
