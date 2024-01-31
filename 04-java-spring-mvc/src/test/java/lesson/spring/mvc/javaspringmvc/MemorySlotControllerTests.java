package lesson.spring.mvc.javaspringmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
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

    public class ObjectSerializer extends JsonSerializer<Object> {

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeObject(value);
        }
    }


    public class ObjectDeserializer extends JsonDeserializer<Object> {

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.readValueAs(Object.class);
        }
    }

    @JsonSerialize(using = ObjectSerializer.class)
    @JsonDeserialize(using = ObjectDeserializer.class)
    public class TestObject {
    }


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
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
                .andExpect(content().string(""));

        verify(memorySlotController).postMemory(any());
    }

    @Test
    void testGetMemory() throws Exception {
        when(memorySlotController.getMemory()).thenReturn(sampleObject);

        mockMvc.perform(get("/memory"))
                .andExpect(status().isOk())
                .andExpect(content().json(sampleObject));

        verify(memorySlotController).getMemory();
    }
}
