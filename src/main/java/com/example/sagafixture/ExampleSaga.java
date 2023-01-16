package com.example.sagafixture;

import com.example.sagafixture.event.SagaStarted;
import org.axonframework.modelling.saga.SagaEventHandler;
import org.axonframework.modelling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;

@Saga
public class ExampleSaga {
    
    @StartSaga
    @SagaEventHandler(payloadType = SagaStarted.class, associationProperty = "id")
    public void handleStarted() {
        // do nothing
    }
}
