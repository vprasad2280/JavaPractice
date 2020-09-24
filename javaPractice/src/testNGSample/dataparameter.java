package testNGSample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataparameter {

	@DataProvider
	public Object[][] loginData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "venkat";
		data[0][1] = "1234";

		data[1][0] = "Prasad";
		data[1][1] = "1768";

		data[2][0] = "Rahul";
		data[2][1] = "1278";

		return data;

	}

}
