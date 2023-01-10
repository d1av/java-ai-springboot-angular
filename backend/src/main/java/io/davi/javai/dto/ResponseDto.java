package io.davi.javai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseDto {
    private String type;
    private String quote;
    private String image;
    private String video;
    private String author;
    private String nature;
    private String extras;
}
