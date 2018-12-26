package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_match_getFitProdRenderNewTestCase {

    @Test(groups ="LoginTrue",description = "获取商品配件渲染信息")
    public void gs_match_getFitProdRenderNewTest(){
        Response response = given()
                .contentType("application/json")
                .auth().oauth2(UrlConfig.access_token)
                .body("{\"customKey\":null,\"usrId\":\"523\",\"companyId\":\"239\",\"mainProdCode\":\"QZJ001\",\"platformType\":\"D_MAT_PC\",\"fitProdList\":[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]}")
                .post(UrlConfig.gs_match_getFitProdRenderNew_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
