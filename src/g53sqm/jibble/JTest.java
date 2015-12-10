package g53sqm.jibble;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import g53sqm.jibble.RequestThread;
public class JTest {


	@Test
	public void test_runMethod(){
		RequestThread reqThread = new RequestThread(null, null);
		assertEquals("", reqThread.run());
	}
	@After
	public void stop()
	{
	    try
	    {
	        RequestThread.stop();
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}