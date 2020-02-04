package services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    private final RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
