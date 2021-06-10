package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver webDriver;

    private By inputUploadFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileName = By.id("uploaded-files");

    private By statusAlert = By.tagName("h3");

    public FileUploadPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickUploadButton() {
        webDriver.findElement(uploadButton).click();
    }

    public String getUploadFileName() {
        return webDriver.findElement(uploadedFileName).getText();
    }

    //passing in the absolute path of the file to form.
    public void uploadFile(String absolutePathOfFile) {
        webDriver.findElement(inputUploadFile).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getAlertText() {
        return webDriver.findElement(statusAlert).getText();
    }

}
