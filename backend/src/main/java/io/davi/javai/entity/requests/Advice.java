package io.davi.javai.entity.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Advice {
    private String quote;
    private String author;
}
