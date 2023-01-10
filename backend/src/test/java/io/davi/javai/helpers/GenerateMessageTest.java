package io.davi.javai.helpers;

import io.davi.javai.entity.requests.Advice;
import io.davi.javai.entity.requests.Bored;
import io.davi.javai.entity.requests.Insult;
import io.davi.javai.entity.requests.Url;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateMessageTest {

    @Test
    public void InsultRequestEntityShouldNotBeNull() {

        Insult entity = new Insult();
        entity.setInsult("insult");
        entity.setCreatedby("createdBy");

        Assertions.assertNotNull(entity.getInsult());
        Assertions.assertNotNull(entity.getCreatedby());
        Assertions.assertEquals("insult",entity.getInsult());
        Assertions.assertEquals("createdBy",entity.getCreatedby());

    }

    @Test
    public void AdviceResquestEntityShouldNotBeNull() {

        Advice entity = new Advice();
        entity.setQuote("quote here");
        entity.setAuthor("author here");

        Assertions.assertNotNull(entity.getQuote());
        Assertions.assertNotNull(entity.getAuthor());
        Assertions.assertEquals("quote here",entity.getQuote());
        Assertions.assertEquals("author here",entity.getAuthor());

    }

    @Test
    public void BoredEntityShouldNotBeNull() {

        Bored entity = new Bored();
        entity.setActivity("activity");
        entity.setType("activity_type");

        Assertions.assertNotNull(entity.getActivity());
        Assertions.assertNotNull(entity.getType());
        Assertions.assertEquals("activity", entity.getActivity());
        Assertions.assertEquals("activity_type", entity.getType());

    }

}
