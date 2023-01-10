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

    public String getAnimeBonkImage() {
        return animeBonkImage;
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
