package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final static String LINK ="File Upload";
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public FileUploadPage clickFileUpload() {
        clickLink(LINK);
        return new FileUploadPage(webDriver);
    }

    private void clickLink(String linkText) {
        webDriver.findElement(By.linkText(linkText)).click();
    }
}



