package RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class MyRestClass {

    @Test
    public void restexample() {

        given().
                when().
                get("http://dummy.restapiexample.com/api/v1/employees?employees_id").
                then().log().
                assertThat().
                statusCode(200).
                body("id", equalTo(employees.getId()));

    }

    public static void getResponseBody(){
        String status = get("http://dummy.restapiexample.com/api/v1/employees?employees_id").then().log()
                .all()
                .body()
                .extract()
                .path("/employees/id")
                .toString();

    }

    public static void getResponseBodyStatus() {
        int statusCode = given().
                when().
                get("http://dummy.restapiexample.com/api/v1/employees?employees_id").then().log().getStatusCode();

        System.out.print("Response Status Code : " + statusCode);
        given().when().get("http://dummy.restapiexample.com/api/v1/employees?employees_idcom/").then().assertThat().statusCode(200);
    }


}
