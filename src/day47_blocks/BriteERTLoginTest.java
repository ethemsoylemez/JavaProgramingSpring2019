package day47_blocks;

import static day47_blocks.BriteERP.*;
public class BriteERTLoginTest {
	public static void main(String[] args) {
		//call static method
//		BriteERP.enterEmail();
//		BriteERP.enterPassword();
//		BriteERP.verifyLogin();
		
		//after static import, we don't need to type class name again
		enterEmail();
		enterPassword();
		verifyLogin();
	}

}
