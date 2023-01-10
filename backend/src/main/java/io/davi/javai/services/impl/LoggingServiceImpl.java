package io.davi.javai.services.impl;

import io.davi.javai.dto.ResponseDto;
import io.davi.javai.entity.ErrorLog;
import io.davi.javai.entity.Response;
import io.davi.javai.exceptions.JavaAIError;
import io.davi.javai.repository.ErrorLogRepository;
import io.davi.javai.repository.ResponseRepository;
import io.davi.javai.services.LoggingService;
import org.springframework.stereotype.Service;

@Service
public class LoggingServiceImpl implements LoggingService {

    private ErrorLogRepository errorLogRepository;
    private ResponseRepository responseRepository;

    public LoggingServiceImpl(ErrorLogRepository errorLogRepository, ResponseRepository responseRepository) {
        this.errorLogRepository = errorLogRepository;
        this.responseRepository = responseRepository;
    }

    @Override
    public void saveErrorToDatabase(String exceptionName, String message) {
        if (exceptionName == null || message == null) {
            throw new JavaAIError("Error on getting log, because log is null");
        }
        ErrorLog errorLog = new ErrorLog(null, exceptionName, message);
        errorLogRepository.save(errorLog);
    }

    @Override
    public void saveResponseToDatabase(ResponseDto responseDto) {
        Response response = new Response();
        response.setType(responseDto.getType());
        response.setNature(responseDto.getNature());
        response.setQuote(responseDto.getQuote());
        response.setVideo(responseDto.getVideo());
        response.setExtras(responseDto.getExtras());
        response.setImage(responseDto.getImage());
        response.setAuthor(responseDto.getAuthor());

        responseRepository.save(response);
    }
}
