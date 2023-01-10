package io.davi.javai.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Variables {

    @Value("${insult.message}")
    private String insultMessage;
    @Value("${advice.message}")
    private String adviceMessage;
    @Value("${bored.message}")
    private String boredMessage;
    @Value("${quote.message}")
    private String quoteMessage;
    @Value("${anime.quote.message}")
    private String animeQuoteMessage;
    @Value("${anime.bonk.image}")
    private String animeBonkImage;
    @Value("${anime.smile.image}")
    private String animeSmileImage;
    @Value("${anime.dance.image}")
    private String animeDanceImage;
    @Value("${anime.cringe.image}")
    private String animeCringeImage;
    @Value("${fox.image}")
    private String foxImage;
    @Value("${duck.image}")
    private String duckImage;
    @Value("${dog.image}")
    private String dogImage;
    @Value("${coffee.image}")
    private String coffeeImage;
    @Value("${useless.fact}")
    private String uselessFact;

    public String getUselessFact() {
        return uselessFact;
    }

    public String getFoxImage() {
        return foxImage;
    }

    public String getDuckImage() {
        return duckImage;
    }

    public String getDogImage() {
        return dogImage;
    }

    public String getCoffeeImage() {
        return coffeeImage;
    }

    public String getAnimeCringeImage() {
        return animeCringeImage;
    }

    public String getAnimeDanceImage() {
        return animeDanceImage;
    }

    public String getAnimeBonkImage() {
        return animeBonkImage;
    }

    public String getAnimeSmileImage() {
        return animeSmileImage;
    }

    public String getInsultMessage() {
        return insultMessage;
    }

    public String getAdviceMessage() {
        return adviceMessage;
    }

    public String getBoredMessage() {
        return boredMessage;
    }

    public String getQuoteMessage() {
        return quoteMessage;
    }

    public String getAnimeQuoteMessage() {
        return animeQuoteMessage;
    }
}
