import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {

@Parameters({"city","area"})	
@Test
public void test(String city, String area)
{
	Reporter.log(city,true);
	Reporter.log(area,true);
}
}
