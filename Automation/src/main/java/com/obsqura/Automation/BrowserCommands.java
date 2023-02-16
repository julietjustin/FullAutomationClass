package com.obsqura.Automation;
public class BrowserCommands extends Base {
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
	public void navigateCommands() throws InterruptedException {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserCommands obj=new BrowserCommands();
		obj.initBrowser();
		obj.basicCommands();
		obj.navigateCommands();
		//obj.browserClose();//any one can be used either close or quit
		//obj.browseQuit();

	}

}
