package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_cus_getCustomListTestCase {

    @Test(groups = "LoginTrue",description = "获取定制方案列表接口")
    public void gs_cus_getCustomListTest(){
        Response response = given()
                .auth().oauth2(UrlConfig.access_token)
                .get(UrlConfig.gs_cus_getCustomList_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
