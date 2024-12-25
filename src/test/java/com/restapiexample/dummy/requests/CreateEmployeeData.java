package com.restapiexample.dummy.requests;

import com.restapiexample.dummy.model.DummyRestPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployeeData extends TestBase {

    @Test
    public void createEmployee() {

        DummyRestPojo dummyRestPojo = new DummyRestPojo();

        dummyRestPojo.setName("Nishi Patel");
        dummyRestPojo.setSalary(70000);
        dummyRestPojo.setAge(24);
        dummyRestPojo.setId(24);
        dummyRestPojo.setImage(" ");

        Response response = given().log().all()
                .header("cookie", "humans_21909=1")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .body(dummyRestPojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}


