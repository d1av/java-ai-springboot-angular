package io.davi.javai.helpers;

import io.davi.javai.entity.Requests.*;
import io.davi.javai.utils.Variables;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
        Quote quote = restTemplate.getForObject(variables.getQuoteMessage(), Quote.class);
        System.out.println(quote.getAuthor().getName());
        return quote;
    }

    public Advice generateAnimeQuote() {
        return restTemplate.getForObject(variables.getAnimeQuoteMessage(), Advice.class);
    }

}
