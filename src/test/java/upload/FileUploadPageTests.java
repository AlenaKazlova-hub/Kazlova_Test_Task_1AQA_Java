package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileUploadPageTests extends BaseTests {
    @Test
    public void testSuccessfulFileUpload() throws InterruptedException {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        Thread.sleep(2000);
        fileUploadPage.uploadFile("D:\\Kazlova_Test_Task_1AQA_Java\\resources\\Altay.jpg");
        Thread.sleep(2000);
        assertTrue(fileUploadPage.getAlertText().contains("File Uploaded!"),
                "Alert text is incorrect");
        assertEquals(fileUploadPage.getUploadFileName(), "Altay.jpg", "Uploaded");

    }


}
