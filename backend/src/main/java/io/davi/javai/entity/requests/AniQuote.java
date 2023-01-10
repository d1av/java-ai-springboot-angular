package io.davi.javai.entity.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AniQuote {
    private String character;
    private String quote;
}
