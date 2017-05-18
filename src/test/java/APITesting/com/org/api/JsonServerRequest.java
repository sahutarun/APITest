package APITesting.com.org.api;

import org.junit.Assert;
import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class JsonServerRequest {
	
	@Test
	public void Test_01(){
		Response resp = given().
				        when().
				        get("http://localhost:3000/posts");
		System.out.println("Get response is:"+ resp.asString());
		
	}
	
	@Test
	public void test_02(){
		given().
		body("{\"id\":\"2\" ,"
				+"\"title\":\"Dummy Title\","
				+"\"author\":\"Tarun\"}").
		when().
		contentType(ContentType.JSON).
		post("http://localhost:3000/posts");
		
		
	}

}
