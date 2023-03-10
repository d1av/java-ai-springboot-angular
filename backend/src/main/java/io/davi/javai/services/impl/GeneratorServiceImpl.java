package io.davi.javai.services.impl;

import io.davi.javai.dto.ResponseDto;
import io.davi.javai.exceptions.HttpRequestError;
import io.davi.javai.helpers.GenerateImage;
import io.davi.javai.helpers.GenerateMessage;
import io.davi.javai.services.GeneratorService;
import io.davi.javai.services.LoggingService;
import io.davi.javai.utils.RandomNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GeneratorServiceImpl implements GeneratorService {

    Logger logger = LoggerFactory.getLogger(GeneratorServiceImpl.class);
    private final GenerateMessage generateMessage;
    private final GenerateImage generateImage;
    private final RandomNumber randomNumber;

    public GeneratorServiceImpl(GenerateMessage generateMessage, GenerateImage generateImage, RandomNumber randomNumber) {
        this.generateMessage = generateMessage;
        this.generateImage = generateImage;
        this.randomNumber = randomNumber;
    }

    @Override
    public ResponseDto getOneMessage() {
        ResponseDto dto = new ResponseDto();
        int chosenNumber = randomNumber.Generate(9);
        //int chosenNumber = 8;
        switch (chosenNumber) {
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
                dto.setNature("uselessFact");
            }
            case 6 -> {
                dto.setType("text");
                dto.setQuote(generateMessage.generateSlipAdvice().getSlip().getAdvice());
                dto.setNature("slipAdvice");
            }
            case 7 -> {
                dto.setType("text");
                dto.setQuote(generateMessage.generateKayneRest().getQuote());
                dto.setAuthor("Kayne West");
                dto.setNature("kayneQuote");
            }
            case 8 -> {
                dto.setType("text");
                dto.setQuote(generateMessage.generateDadJokes().getAttachments()[0].getText());
                dto.setExtras(generateMessage.generateDadJokes().getAttachments()[0].getFallback());
                dto.setNature("dadJokes");
            }
            case 9 -> {
                String author = generateMessage.generateInsult().getCreatedby().trim();
                dto.setType("text");
                dto.setQuote(generateMessage.generateInsult().getInsult());
                dto.setAuthor(author.length() > 1 ? author : null);
                dto.setNature("insult");
            }
            default -> {
                throw new HttpRequestError("Error on Message Api call. Reload and it should disappear.");
            }
        }
        logger.info("SERVICE message : " + chosenNumber);
        //loggingService.saveResponseToDatabase(dto);
        return dto;
    }

    @Override
    public ResponseDto getOneImage() {
        ResponseDto dto = new ResponseDto();
        int chosenNumber = randomNumber.Generate(8);
        //int chosenNumber = 4;
        switch (chosenNumber) {
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
                String dogImageOrVideo = generateImage.generateDog().getUrl();
                if (dogImageOrVideo != null) {
                    if (dogImageOrVideo.endsWith(".mp4")) {
                        dto.setType("video");
                        dto.setVideo(dogImageOrVideo);
                        dto.setNature("dogVideo");
                    } else {
                        dto.setType("image");
                        dto.setImage(dogImageOrVideo);
                        dto.setNature("dogImage");
                    }
                }
            }
            case 7 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateDuck().getUrl());
                dto.setNature("duckImage");
            }
            case 8 -> {
                dto.setType("image");
                dto.setImage(generateImage.generateAnimeBonk().getUrl());
                dto.setNature("bonkImage");
            }
            default -> {
                throw new HttpRequestError("Error on Image Api call. Reload and it should disappear.");
            }
        }
        logger.info("SERVICE image: " + chosenNumber);
        //loggingService.saveResponseToDatabase(dto);
        return dto;
    }


}
