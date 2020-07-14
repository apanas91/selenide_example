import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import pageobject.IndexPage;

public class IndexPageTest {
    String login = "login";
    String password = "password";

    @Before
    public void init() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    public void selenideTest() {
        Selenide.open("/login");
        IndexPage ip = Selenide.page(IndexPage.class);
        ip.typeLogin(login)
                .typePassword(password)
                .clickSubmit();
    }

}
