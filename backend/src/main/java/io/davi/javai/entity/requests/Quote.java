package io.davi.javai.entity.requests;

import io.davi.javai.entity.requests.nested.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quote {
    private String text;
    private Author author;

    private String source;
}

