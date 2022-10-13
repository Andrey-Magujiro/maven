package com.andreev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.HashMap;

public class myServletTest {

    @Test
    void shouldAnswerWithTrue(){
        Assertions.assertFalse(() -> myServlet.map.size() == 5);
    }
}
