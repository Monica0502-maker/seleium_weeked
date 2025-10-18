package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	
	public String getSystemTime() {
		
		return LocalDateTime.now().toString().replace(":", "-");
	}
		
	public int getRandomnumber() {
		
		Random ran=new Random();
		return ran.nextInt(1000);
		
		
		
	}
		
		
		
	

}
