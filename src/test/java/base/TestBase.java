package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AddNewVersionPage;
import pages.KokpitPage;
import pages.LoginPage;
import pages.VersionsPage;

public class TestBase {
    public WebDriver driver;
    public LoginPage loginPage;
    public KokpitPage kokpitPage;
    public VersionsPage versionsPage;
    public AddNewVersionPage addNewVersionPage;


}
