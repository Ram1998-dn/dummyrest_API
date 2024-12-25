package com.restapiexample.dummy.requests;

import com.restapiexample.dummy.model.DummyRestPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployeeData extends TestBase {

    @Test
    public void updateUserinfo() {
        DummyRestPojo dummyRestPojo = new DummyRestPojo();

        dummyRestPojo.setName("Nishi Patel ");
        dummyRestPojo.setSalary(50000);
        dummyRestPojo.setAge(24);
        dummyRestPojo.setId(22);
        dummyRestPojo.setImage(" ");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("cookie", "humans_21909=1")
                .when()
                .body(dummyRestPojo)
                .put("/update/9");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}


