package APITesting.com.org.api;

import org.junit.Assert;
import org.junit.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class WhetherGETRequest {
	
	@Test
	public void Test_01(){
		
		Response resp=when().
		               get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=4c407006c530986ac683ae110f1db2e3");
		System.out.println(resp.getStatusCode());
		Assert.assertEquals(resp.getStatusCode(), 200);
	}
	
	//Usage of parameters with rest assured
	@Test
	public void Test_02(){
		
		Response resp=given().
				      param("q", "London").
				      param("appid","4c407006c530986ac683ae110f1db2e3").
				      when().
	                  get("http://api.openweathermap.org/data/2.5/weather");
		
	System.out.println(resp.getStatusCode());
	Assert.assertEquals(resp.getStatusCode(),200);
	
	if(resp.getStatusCode()==200){
		System.out.println("API is working fine");
	}
	else{
		System.out.println("API is not working fine");

	}
		
		
	}
	

}
