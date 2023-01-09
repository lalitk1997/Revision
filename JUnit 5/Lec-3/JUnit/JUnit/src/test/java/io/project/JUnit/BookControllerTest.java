package io.project.JUnit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { JUnitApplicationTests.class })
public class BookControllerTest {
    private MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookController bookController;
    Book record_1 = new Book(1L, "Atomic Habiit", "-", 4);
    Book record_2 = new Book(2L, "Ikigai", "-", 3);
    Book record_3 = new Book(3L, "Champak-Chacha", "-", 5);
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks();
    }

}
