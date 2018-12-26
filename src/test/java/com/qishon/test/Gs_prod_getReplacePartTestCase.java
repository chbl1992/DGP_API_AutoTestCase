package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getReplacePartTestCase {

    @Test(groups = "LoginTrue",description = "获取可替换部件和面料")
    public void gs_prod_getReplacePartTest(){
        Response response = given()
                .auth().oauth2(UrlConfig.access_token)
                .get(UrlConfig.gs_prod_getReplacePart_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
