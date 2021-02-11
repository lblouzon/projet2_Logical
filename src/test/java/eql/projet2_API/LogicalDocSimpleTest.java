package eql.projet2_API;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class LogicalDocSimpleTest {
	
	@Test
	public void test() throws Exception {
	    SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
	    testCaseRunner.setProjectFile("C:\\Users\\formation\\Desktop\\projet2\\LogicalDoc2.xml");
	    try {
	        testCaseRunner.run();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
