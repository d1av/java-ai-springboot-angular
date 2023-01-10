package io.davi.javai.Services.Impl;

import io.davi.javai.Services.GeneratorService;
import io.davi.javai.dto.ResponseDto;
import io.davi.javai.helpers.GenerateMessage;
import org.springframework.stereotype.Service;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    private GenerateMessage generators;

    public GeneratorServiceImpl(GenerateMessage generators) {
        this.generators = generators;
    }

    @Override
    public ResponseDto getOneStatement() {
        ResponseDto dto = new ResponseDto();
        //   int math = Math.toIntExact(Math.round(Math.random() * 5));
        int math = 5;
        switch (math) {
            case 1 -> {
                dto.setQuote(generators.generateInsult().getInsult());
            }
            case 2 -> {
                dto.setQuote(generators.generateAdvice().getQuote());
            }
            case 3 -> {
                dto.setQuote(generators.generateBored().getActivity());
            }
            case 4 -> {
                dto.setQuote(generators.generateQuote().getText());
            }
            case 5 -> {
                dto.setQuote(generators.generateAnimeQuote().getQuote());
                dto.setAuthor(generators.generateQuote().getAuthor().getName());
            }
            default -> {
                throw new RuntimeException();
            }
        }
        return dto;
    }
}
