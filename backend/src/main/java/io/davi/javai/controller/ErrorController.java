package io.davi.javai.controller;

import io.davi.javai.dto.ResponseDto;
import io.davi.javai.entity.requests.Url;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/error")
public class ErrorController {

    private RestTemplate restTemplate;

    public ErrorController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<String> getBuggyStatement() {
        String url = restTemplate.getForObject("https://random.dog/woof.jso", Url.class).getUrl();
        System.out.println(url);
        return new ResponseEntity<>(url, HttpStatus.OK);
    }
}
