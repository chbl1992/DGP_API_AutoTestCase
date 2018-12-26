package com.qishon.test;

import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_cus_saveCustomTestCase {

    @Test(groups = "LoginTrue",description = "保存定制方案")
    public void gs_cus_saveCustomTest(){
        Response response = given()
                .contentType("application/json")
                .auth().oauth2(UrlConfig.access_token)
                .body("{\"busContsCode\":\"D_BUSCONTS_DGP\",\"ctmUsrId\":null,\"shopCode\":\"QS0001\",\"deviceCode\":\"C85B76DB6828\",\"designHdFileHdId\":\"9978\",\"goodsCode\":\"QZJ001\",\"mainFabricCode\":null,\"detailedList\":[{\"regionId\":\"66\",\"partId\":\"530\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\",\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}],\"propPartList\":[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]}")
                .post(UrlConfig.gs_cus_saveCustom_url);
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
