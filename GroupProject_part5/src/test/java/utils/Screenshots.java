//Name: Fahad Arif (N01729165)
//Course: Application Testing (CPAN-224)

package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots {

    public static void capture(WebDriver driver, String testName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File dest = new File("screenshots/" + testName + "_" + timeStamp + ".png");

        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            throw new RuntimeException("Screenshot failed", e);
        }
    }
}