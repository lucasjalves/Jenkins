package l.l;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class JenkinsTest extends TestCase {

    public JenkinsTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( JenkinsTest.class );
    }


    public void testApp()
    {
        assertEquals("Deu erro ",2, 2);
    }
}
