package io.davi.javai.entity.requests;

import io.davi.javai.entity.requests.nested.Attachments;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DadJokes {
    private Attachments[] attachments;
}
