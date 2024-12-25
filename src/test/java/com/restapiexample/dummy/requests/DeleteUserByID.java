package com.restapiexample.dummy.requests;

import com.restapiexample.dummy.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserByID extends TestBase {

    @Test
    public void deleteUser() {
        given().log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("cookie","humans_21909=1")
                .when()
                .delete("/delete/21")
                .then().log().all()
                .statusCode(204);

    }

}

