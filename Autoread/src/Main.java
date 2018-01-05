import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Main {

	
	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		//System.setProperty("phantomjs.binary.path", "/home/toghrul/Desktop/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
        //WebDriver w=new HtmlUnitDriver();
        //w.get("https://www.programcreek.com/java-api-examples/index.php?api=org.openqa.selenium.htmlunit.HtmlUnitDriver");
        
		/*WebClient webClient = new WebClient();
		HtmlPage currentPage = webClient.getPage("http://www.google.com/");
        System.out.println(currentPage.getTitleText());*/
		WebDriver w=new HtmlUnitDriver();
		w.get("https://www.check24.de/handytarife/vergleich/?data_included=1000&minutes_included=all&select_contract=-24&young_tariff=no&tid=CH24_MF_GO_1&wpset=google_mobilfunk_01&gclid=Cj0KCQiAvrfSBRC2ARIsAFumcm8mlN6DXXITR7OCn-3lnOYlzyEpWcYwOT4XEPv3bDStDWq49hgGZ9IaAqlsEALw_wcB&orderby=empfehlung_preis");
		
		System.out.println();
        //w.quit();
	}
}
