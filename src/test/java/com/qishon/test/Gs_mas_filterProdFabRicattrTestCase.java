package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_mas_filterProdFabRicattrTestCase {

    @Test(groups = "LoginTrue",description = "搜索可替换面料")
    public void gs_mas_filterProdFabRicattrTest(){
        Response response = given()
                .contentType("application/json")
                .auth().oauth2(UrlConfig.access_token)
                .post(UrlConfig.gs_mas_filterProdFabRicattr_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
