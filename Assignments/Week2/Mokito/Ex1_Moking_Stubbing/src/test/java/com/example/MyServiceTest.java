package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock of ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub the method to return "Mock Data"
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and verify
        String result = service.fetchData();

        // Step 5: Assertion
        assertEquals("Mock Data", result);

        // Optional: Verify that getData() was called once
        verify(mockApi, times(1)).getData();
    }
}
