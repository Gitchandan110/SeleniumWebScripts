package com.RestAssured.Api;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Get_Regres_ListResource {
	
	//https://www.javadoc.io/doc/io.rest-assured/rest-assured/latest/io/restassured/RestAssured.html

	@Test

	public void getListResource() {

		Response response = get("https://reqres.in/api/unknown");

		System.out.println(response.getBody().asString());
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content_type"));
		
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	
	
	@Test
	
	public void getSingleUser() {
		
		given().get("https://reqres.in/api/users/2").then().statusCode(200);
		
	}
	
}