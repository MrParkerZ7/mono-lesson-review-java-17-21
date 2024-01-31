package lesson.spring.mvc.javaspringmvc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

@WebMvcTest(MemorySlotController.class)
class MemorySlotControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MemorySlotController memorySlotController;

    private String sampleObject;

    @BeforeEach
    void setUp() {
        sampleObject = "{\"name\":\"Puck\"}";
    }

    @Test
    void testPostMemory() throws Exception {
        String jsonBody = sampleObject;

        mockMvc.perform(post("/memory")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonBody))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"name\":\"Puck\"}"));
    }

    @Test
    void testGetMemory() throws Exception {
        MemorySlotController.memory = sampleObject;

        mockMvc.perform(get("/memory"))
                .andExpect(status().isOk())
                .andExpect(content().json(sampleObject));
    }
}
