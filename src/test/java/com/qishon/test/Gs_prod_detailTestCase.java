package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_detailTestCase {

    @Test(groups = "LoginTrue",description = "获取商品销量，评价，标签")
    public void gs_prod_detailTest(){
        Response response = given()
                .auth().oauth2(UrlConfig.access_token)
                .get(UrlConfig.gs_prod_detail_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
