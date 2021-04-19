package RestAssured;

import static io.restassured.RestAssured.*;

/**
 * Created by JG on 4/19/21.
 */
public class MyRestClass {

    @Test
    public void restexample() {

        given().
                when().
                get("http://dummy.restapiexample.com/").
                then().
                assertThat().
                statusCode(200);
    }

    public static void getResponseBody(){
        int status = given().
                when().
                get("http://dummy.restapiexample.com/").then().log()
                .all()
                .toString();

    }

    public static void getResponseBodyStatus() {
        int statusCode = given().
                when().
                get("http://dummy.restapiexample.com/").then().log().getStatusCode();

        System.out.print("Response Status Code : " + statusCode);
        given().when().get("http://dummy.restapiexample.com/").then().assertThat().statusCode(200);
    }


}
