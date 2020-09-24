package testNGSample;

import org.testng.annotations.Test;

public class accessDPdata extends dataparameter{
	
	@Test(dataProvider = "loginData")
	public void login(String username, String password) {
		System.out.println("user able to login successfully using username :" + username + "  and password :" + password);
	}

}
