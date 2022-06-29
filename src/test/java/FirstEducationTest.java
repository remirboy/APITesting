import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstEducationTest {

    @Test
    public void testWithBeverlyHillsPlaceName() {

        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void requestUsZipCode90210_logRequestAndResponseDetails() {
        given().
                log().all().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                log().headers();
    }
}