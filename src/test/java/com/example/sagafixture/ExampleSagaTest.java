package com.example.sagafixture;

import com.example.sagafixture.event.SagaStarted;
import java.util.UUID;
import org.axonframework.test.saga.SagaTestFixture;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExampleSagaTest {
    
    @RepeatedTest(100)
    void throwsConcurrentModificationException() {
        SagaTestFixture<ExampleSaga> fixture = new SagaTestFixture<>(ExampleSaga.class);
        fixture.givenAPublished(new SagaStarted(UUID.randomUUID().toString()));
    }
}
