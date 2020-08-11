package TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
@Test
@Parameters({"Firstname"})

public void Login(String fname)
{
	System.out.println(fname);
}

}
