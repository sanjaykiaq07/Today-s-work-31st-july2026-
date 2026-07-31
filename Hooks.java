package hooks;

import base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {

    @Before
    public void setUp() {

        System.out.println("Launching Browser...");

        launchBrowser();
    }

    @After
    public void tearDown() {

        System.out.println("Closing Browser...");

        closeBrowser();
    }

	private void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
}
