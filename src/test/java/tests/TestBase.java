package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://www.agoda.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }
}
