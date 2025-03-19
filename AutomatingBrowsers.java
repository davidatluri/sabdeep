package lanuchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingBrowsers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\david\\Desktop\\Automation\\chromedriver.exe" );
		ChromeDriver ad=new ChromeDriver();
		ad.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		ad.manage().window().maximize();
		ad.getPageSource();
		ad.getTitle();
		ad.getCurrentUrl();
		ad.navigate().to("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwytS-BhCKARIsAMGJyzqJACOYMJTt6k2G6AUkdX6ZGLJmCffN59i6uCWpCiVO1pSOruEHF0UaAvqNEALw_wcB");
		Thread.sleep(5000);
		ad.navigate().back();
		ad.navigate().forward();
		ad.navigate().refresh();
		ad.close();
		
}

}
