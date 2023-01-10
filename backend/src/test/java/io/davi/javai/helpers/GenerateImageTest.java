package io.davi.javai.helpers;

import io.davi.javai.entity.requests.Url;
import io.davi.javai.utils.Variables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class GenerateImageTest {

    @Test
    public void UrlFieldShouldNotBeNull() {

        Url entity = new Url();
        entity.setUrl("http://google.com/");

        Assertions.assertNotNull(entity.getUrl());

    }

    @Test
    public void FileFieldShouldNotBeNull() {

        Url entity = new Url();
        entity.setFile("http://google.com/");

        Assertions.assertNotNull(entity.getFile());

    }

    @Test
    public void ImageFieldShouldNotBeNull() {

        Url entity = new Url();
        entity.setImage("http://google.com/hello.jpg");

        Assertions.assertNotNull(entity.getImage());

    }

}
