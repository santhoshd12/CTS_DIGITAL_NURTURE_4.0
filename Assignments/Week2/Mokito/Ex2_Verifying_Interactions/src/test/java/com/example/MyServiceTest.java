package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub (optional for interaction verification)
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method
        service.fetchData();

        // Step 5: Verify interaction
        verify(mockApi).getData();  // Check if getData() was called exactly once
    }
}
