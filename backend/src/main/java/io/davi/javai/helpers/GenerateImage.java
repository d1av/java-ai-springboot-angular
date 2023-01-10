package io.davi.javai.helpers;

import io.davi.javai.entity.Requests.Url;
import io.davi.javai.utils.Variables;
import org.springframework.web.client.RestTemplate;

public class GenerateImage {
    private RestTemplate restTemplate;
    private Variables variables;

    public GenerateImage(RestTemplate restTemplate, Variables variables) {
        this.restTemplate = restTemplate;
        this.variables = variables;
    }

    public Url generateAnimeBonk() {
        return restTemplate.getForObject(variables.getAnimeBonkImage(), Url.class);
    }
}
