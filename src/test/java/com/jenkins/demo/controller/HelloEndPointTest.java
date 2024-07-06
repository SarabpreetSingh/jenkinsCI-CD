package com.jenkins.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
@WebMvcTest
class HelloEndPointTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        String name = "Hello World";
        mockMvc.perform(MockMvcRequestBuilders.get("/get/{name}",name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(name));
    }
}