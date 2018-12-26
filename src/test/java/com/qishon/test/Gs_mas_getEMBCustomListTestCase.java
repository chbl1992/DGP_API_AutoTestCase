package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_mas_getEMBCustomListTestCase {

    @Test(groups = "LoginTrue",description = "获取绣字可定制部位列表")
    public void gs_mas_getEMBCustomListTest(){
        Response response = given()
                .auth().oauth2(UrlConfig.access_token)
                .get(UrlConfig.gs_mas_getEMBCustomList_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
