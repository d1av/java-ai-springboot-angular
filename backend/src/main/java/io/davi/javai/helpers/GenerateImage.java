package io.davi.javai.helpers;

import io.davi.javai.entity.requests.Url;
import io.davi.javai.utils.Variables;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
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

    public Url generateAnimeSmile() {
        return restTemplate.getForObject(variables.getAnimeSmileImage(), Url.class);
    }

    public Url generateAnimeDance() {
        return restTemplate.getForObject(variables.getAnimeDanceImage(), Url.class);
    }

    public Url generateAnimeCringe() {
        return restTemplate.getForObject(variables.getAnimeCringeImage(), Url.class);
    }

    public Url generateFox() {
        return restTemplate.getForObject(variables.getFoxImage(), Url.class);
    }

    public Url generateDog() {
        return restTemplate.getForObject(variables.getDogImage(), Url.class);
    }

    public Url generateDuck() {
        return restTemplate.getForObject(variables.getDuckImage(), Url.class);
    }

    public Url generateCoffe() {
        return restTemplate.getForObject(variables.getCoffeeImage(), Url.class);
    }
}
