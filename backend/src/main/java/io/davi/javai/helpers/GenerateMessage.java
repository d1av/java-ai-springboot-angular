package io.davi.javai.helpers;

import io.davi.javai.entity.requests.*;
import io.davi.javai.utils.Variables;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class GenerateMessage {

    private Variables variables;
    private RestTemplate restTemplate;

    public GenerateMessage(Variables variables, RestTemplate restTemplate) {
        this.variables = variables;
        this.restTemplate = restTemplate;
    }


    public Insult generateInsult() {
        return restTemplate.getForObject(variables.getInsultMessage(), Insult.class);
    }

    public Advice generateAdvice() {
        return restTemplate.getForObject(variables.getAdviceMessage(), Advice.class);
    }

    public Bored generateBored() {
        return restTemplate.getForObject(variables.getBoredMessage(), Bored.class);
    }

    public Quote generateQuote() {
        return restTemplate.getForObject(variables.getQuoteMessage(), Quote.class);
    }

    public AniQuote generateAnimeQuote() {
        return restTemplate.getForObject(variables.getAnimeQuoteMessage(), AniQuote.class);
    }

    public Quote generateUselessFact() {
        return restTemplate.getForObject(variables.getUselessFact(), Quote.class);
    }

    public Slip generateSlipAdvice() {
        // makes request accept any media response
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        Slip res = restTemplate.getForObject(variables.getSlipAdvice(), Slip.class);
        return res;
    }

}
