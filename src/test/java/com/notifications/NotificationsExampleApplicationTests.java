package com.notifications;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotificationsExampleApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

//    @Test
//    public void givenAppStarted_whenNotificationTasksSubmitted_thenProcessed() {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject(, String.class);
//    }

    @Test
    public void retrive() {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/startNotification/10")).andExpect(status().isOk())
                    .andDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
