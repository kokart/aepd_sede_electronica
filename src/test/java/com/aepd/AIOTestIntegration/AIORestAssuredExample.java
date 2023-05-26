package com.aepd.AIOTestIntegration;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class AIORestAssuredExample {
    public static final String IMPORT_RESULTS = "/project/{projectKey}/testcycle/{cycleKey}/import/results?type={type}";
    private static RequestSpecification defaultRequestSpec;

    public static void main(String[] args) {

        setupAIORestAssuredConfig();

        importResults("AE", "AE-CY-2","target/surefire-reports/testng-results.xml", "Testng");
    }

    private static void importResults(String projectKey, String cycleKey, String fileName, String frameworkType) {
        Map<String, Object> formParams = new HashMap<>();
        formParams.put("createNewRun", true);
        formParams.put("addCaseToCycle", true);
        formParams.put("createCase", true);
        File f = new File(fileName);
        System.out.println("**********************************************");
        System.out.println();
        System.out.println(f.getPath());
        System.out.println("**********************************************");
        doMultipartPost(IMPORT_RESULTS, f, formParams, projectKey, cycleKey, frameworkType);
    }

    public static Response doMultipartPost(String path, File file, Map<String, Object> formParams, Object... pathParams) {
        System.out.println("path:" + path);
        Response response = given(defaultRequestSpec).multiPart("file", file).formParams(formParams).when().post(path, pathParams).andReturn();
        response.prettyPrint();
        return response;
    }

    public static void setupAIORestAssuredConfig() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://tcms.aioreports.com").setBasePath("/aio-tcms/api/v1");
        builder.addHeader("Authorization", "AioAuth Y2Q1MDY0YWItOGMzOS00OGNjLTg0NGUtOGZiMmM3ODY3MjAz");
        builder.log(LogDetail.METHOD).log(LogDetail.URI);
        defaultRequestSpec = builder.build();
    }
}