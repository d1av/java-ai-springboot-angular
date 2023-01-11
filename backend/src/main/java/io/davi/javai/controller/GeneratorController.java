package io.davi.javai.controller;

import io.davi.javai.dto.ResponseDto;
import io.davi.javai.services.GeneratorService;
import io.davi.javai.utils.RandomNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api/v1")
public class GeneratorController {

    private final GeneratorService generatorService;
    private final RandomNumber randomNumber;

    public GeneratorController(GeneratorService generatorService, RandomNumber randomNumber) {
        this.generatorService = generatorService;
        this.randomNumber = randomNumber;
    }

    @GetMapping
    public ResponseEntity<ResponseDto> getOneStatement() {
        int chosenNumber = randomNumber.Generate(11);
        ResponseDto dto = (chosenNumber <= 6) ? generatorService.getOneImage() : generatorService.getOneMessage();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }


}
