package httpconnection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import rest.endpoints.RESTEndpoints;

import java.io.IOException;

public class HttpClient {

    public static void main(String[] args) throws IOException {

            //Creating HttpClient object
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //Creating HttpGet object
            RESTEndpoints restEndpoints = new RESTEndpoints();
            String country = "AUS";
            String mySite = "https://www.quandl.com/api/v3/datasets/WWDI/"+country+"_NY_GDP_MKTP_CN.json?api_key=SYzAszFwm335jNvFgyHd";
            HttpGet getRequest = new HttpGet(mySite);

            getRequest.addHeader("accept", "application/json");


        HttpResponse response = null;
        try {
            response = httpClient.execute(getRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpEntity entity = response.getEntity();

      String myGDPResponse = EntityUtils.toString(entity,"UTF-8");
        System.out.println(myGDPResponse);

      //String myOilConsumptionResponse = EntityUtils.toString(entity,"UTF-8");




    }

    }

