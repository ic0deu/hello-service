package i.c0d.eu.resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloResourceTest {

    private HelloResource testObj = new HelloResource();
    @Test
    public void test_politeEndpoint_method() {
        String name = "Edward";
        String expectedResponse = String.format("Hi %s!!!", name);


        assertThat(testObj.politeEndpoint(name).getStatus()).isEqualTo(200);

        assertThat(testObj.politeEndpoint(name).getEntity()).isEqualTo(expectedResponse);

    }
}