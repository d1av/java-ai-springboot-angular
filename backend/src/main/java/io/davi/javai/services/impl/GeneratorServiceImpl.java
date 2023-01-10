package io.davi.javai.services.impl;

import io.davi.javai.helpers.GenerateImage;
import io.davi.javai.services.GeneratorService;
import io.davi.javai.dto.ResponseDto;
import io.davi.javai.helpers.GenerateMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLogger;
import org.springframework.stereotype.Service;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    private Logger logger = LoggerFactory.getLogger(GeneratorServiceImpl.class);

    private GenerateMessage generateMessage;
    private GenerateImage generateImage;

    public GeneratorServiceImpl(GenerateMessage generateMessage, GenerateImage generateImage) {
        this.generateMessage = generateMessage;
        this.generateImage = generateImage;
    }

    @Override
    public ResponseDto getOneMessage() {
        ResponseDto dto = new ResponseDto();
        int randomNumber = Math.toIntExact(Math.round(Math.random() * 5));
        //int math = 4;
        switch (randomNumber) {
            case 0 -> {
                String author = generateMessage.generateInsult().getCreatedby().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateInsult().getInsult());
                dto.setAuthor(author.length() > 1 ? author : null);
                dto.setNature("insult");
            }
            case 1 -> {
                String author = generateMessage.generateAdvice().getAuthor().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateAdvice().getQuote());
                dto.setAuthor(author.length() > 1 ? author : null);
                dto.setNature("advice");
            }
            case 2 -> {
                dto.setType("text");
                dto.setQuote(generateMessage.generateBored().getActivity());
                dto.setExtras(generateMessage.generateBored().getType().trim());
                dto.setNature("bored");
            }
            case 3 -> {
                String author = generateMessage.generateQuote().getAuthor().getName().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateQuote().getText());
                dto.setAuthor(author.length() > 1 ? author : null);
                dto.setNature("quote");
            }
            case 4 -> {
                String character = generateMessage.generateAnimeQuote().getCharacter().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateAnimeQuote().getQuote());
                dto.setAuthor(character.length() > 1 ? character : null);
                dto.setNature("animeQuote");
            }
            case 5 -> {
                String source = generateMessage.generateUselessFact().getSource().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateUselessFact().getText());
                dto.setAuthor(source.length() > 1 ? source : null);
                dto.setNature("animeQuote");
            }
            default -> {
                throw new RuntimeException();
            }
        }
        logger.info("SERVICE message : " + randomNumber);
        return dto;
    }

    @Override
    public ResponseDto getOneImage() {
        ResponseDto dto = new ResponseDto();
        int randomNumber = Math.toIntExact(Math.round(Math.random() * 7));
        //int math = 4;
        switch (randomNumber) {
            case 0 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateAnimeBonk().getUrl());
                dto.setNature("bonkImage");
            }
            case 1 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateAnimeSmile().getUrl());
                dto.setNature("smileImage");
            }
            case 2 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateAnimeDance().getUrl());
                dto.setNature("danceImage");
            }
            case 3 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateAnimeCringe().getUrl());
                dto.setNature("cringeImage");
            }
            case 4 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateCoffe().getFile());
                dto.setNature("coffeeImage");
            }
            case 5 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateFox().getImage());
                dto.setNature("foxImage");
            }
            case 6 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateDog().getUrl());
                dto.setNature("dogImage");
            }
            case 7 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateDuck().getUrl());
                dto.setNature("duckImage");
            }
            default -> {
                throw new RuntimeException();
            }
        }
        logger.info("SERVICE image: " + randomNumber);
        return dto;
    }


}
