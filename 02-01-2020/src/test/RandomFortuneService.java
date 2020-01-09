package test;
import java.util.Random;

public class RandomFortuneService {
	
	
	private String fortService[]= new String[5];
	
    
    public String fortunedetails()
    {
	fortService[0]="a";fortService[1]="b";fortService[2]="c";fortService[4]="d";
	Random r=new Random();
	return fortService[r.nextInt(5)];
			
	
    }
    
    
    
    
    
}
