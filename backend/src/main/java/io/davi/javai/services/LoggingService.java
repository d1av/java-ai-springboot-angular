package io.davi.javai.services;

import io.davi.javai.dto.ResponseDto;
import io.davi.javai.entity.ErrorLog;

public interface LoggingService {
    void saveErrorToDatabase(String exceptionName, String message);
    void saveResponseToDatabase(ResponseDto responseDto);
}
