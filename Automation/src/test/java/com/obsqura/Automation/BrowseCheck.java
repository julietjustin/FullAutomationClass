package com.obsqura.Automation;

import org.junit.Test;

public class BrowseCheck extends Base{
	@Test
	public void basicCommands() {
		String actualTitle,actualURL,actualSource,expectedTitle="Obsqura Testing";
		actualTitle=driver.getTitle();
		actualURL=driver.getCurrentUrl();
		actualSource=driver.getPageSource();
		if(actualTitle.equals(expectedTitle)) {//to check both are equal we use equals
			System.out.println("Actual and expected title are equal");
		}
		else {
			System.out.println("Actual and expected title are not equal");
		}
	}

}
