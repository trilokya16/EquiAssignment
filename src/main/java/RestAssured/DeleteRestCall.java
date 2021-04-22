package RestAssured;

import sun.jvm.hotspot.utilities.Assert;

public class DeleteRestCall {

    public void deleteEmployeeId() {


    int empid = 1234;

        RequestSpecification deleteValidation = RestAssured.given().
                when().
                get("http://dummy.restapiexample.com/api/v1/employees?employees_id").
                delete("/delete/" + empid);
        int StatusCode = deleteValidation.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
    }


}
