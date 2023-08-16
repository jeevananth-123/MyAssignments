package week1.day1;

public class Mobileoppo {
	
	
	public void sendSms() {
		System.out.println("From Oppo");
	}
public long makeCall(long phno) 
{
  return phno;	
}
 public static void main(String[] args) 
 {
	Mobileoppo obj=new Mobileoppo();
	obj.sendSms();
	System.out.println(obj.makeCall(0));
}
}
