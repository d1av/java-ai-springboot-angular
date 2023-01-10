package io.davi.javai.entity.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Insult {
    private String insult;
    private String createdby;

    @Override
    public String toString() {
        return "Quote{" +
                ", insult='" + insult + '\'' +
                ", createdBy='" + createdby + '\'' +
                '}';
    }
}
