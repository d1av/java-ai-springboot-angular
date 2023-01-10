package io.davi.javai.controller;

import io.davi.javai.Services.GeneratorService;
import io.davi.javai.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class GeneratorController {

    private GeneratorService generatorService;

    public GeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping
    public ResponseEntity<ResponseDto> getOneStatement() {
        return new ResponseEntity<>(generatorService.getOneStatement(), HttpStatus.OK);
    }

}
