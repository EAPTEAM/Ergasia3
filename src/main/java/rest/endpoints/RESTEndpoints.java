package rest.endpoints;

public class RESTEndpoints {
    String apiGdpEndpoint;
    String apiOilConsumeEndpoint;

    public RESTEndpoints(String apiGdpEndpoint, String apiOilConsumeEndpoint) {
        this.apiGdpEndpoint = apiGdpEndpoint;
        this.apiOilConsumeEndpoint = apiOilConsumeEndpoint;
    }

    public RESTEndpoints() {
    }

    public String getApiGdpEndpoint() {
        return apiGdpEndpoint;
    }

    public void setApiGdpEndpoint(String apiGdpEndpoint) {
        this.apiGdpEndpoint = apiGdpEndpoint;
    }

    public String getApiOilConsumeEndpoint() {
        return apiOilConsumeEndpoint;
    }

    public void setApiOilConsumeEndpoint(String apiOilConsumeEndpoint) {
        this.apiOilConsumeEndpoint = apiOilConsumeEndpoint;
    }
}
