package edu.fra.uas.beanbeispiel;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {
    @Autowired
    private BeanController beanController; 
    @Autowired
    private MessageService messageService;


    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test"))
                .isEqualTo("Das ist ein Test");
    }

    @Test
    void testMessageService() {
        assertThat(messageService.increment())
                .isEqualTo(1);
    }
}