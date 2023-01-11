package io.davi.javai.entity.requests.nested;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Attachments {
    private String fallback;
    private String text;
    private String footer;
}
