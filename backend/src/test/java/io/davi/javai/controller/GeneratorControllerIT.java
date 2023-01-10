package io.davi.javai.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class GeneratorControllerIT {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void apiResponseOnAccessShouldBeOk() throws Exception {

        ResultActions result =
                mockMvc.perform(get("/api/v1")
                        .contentType(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
    }

    @Test
    public void apiResponseShouldReturnTypeField() throws Exception {

        ResultActions result =
                mockMvc.perform(get("/api/v1")
                        .contentType(MediaType.APPLICATION_JSON));

        result.andExpect(jsonPath("type").exists());
    }
    @Test
    public void apiResponseShouldReturnNatureField() throws Exception {

        ResultActions result =
                mockMvc.perform(get("/api/v1")
                        .contentType(MediaType.APPLICATION_JSON));

        result.andExpect(jsonPath("nature").exists());
    }
}
