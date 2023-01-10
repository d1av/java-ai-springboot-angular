package io.davi.javai.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Variables {


    @Value("${insult.message}") String insultMessage;
    @Value("${advice.message}") String adviceMessage;
    @Value("${bored.message}") String boredMessage;
    @Value("${quote.message}") String quoteMessage;
    @Value("${anime.quote.message}") String animeQuoteMessage;
    @Value("${anime.bonk.image}") String animeBonkImage;
    @Value("${anime.smile.image}") String animeSmileImage;
    @Value("${anime.dance.image}") String animeDanceImage;
    @Value("${anime.cringe.image}") String animeCringeImage;
    @Value("${fox.image}") String foxImage;
    @Value("${duck.image}") String duckImage;
    @Value("${dog.image}") String dogImage;
    @Value("${coffee.image}") String coffeeImage;
    @Value("${useless.fact}") String uselessFact;
    @Value("${slip.advice}") String slipAdvice;
    @Value("${kayne.rest}") String kayneRest;

}
