package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getRegionByTypeTestCase {

    @Test(groups = "LoginTrue",description = "获取定制商品可替换部位")
    public void gs_prod_getRegionByTypeTest(){
        Response response = given()
                .auth().oauth2(UrlConfig.access_token)
                .get(UrlConfig.gs_prod_getRegionByType_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
