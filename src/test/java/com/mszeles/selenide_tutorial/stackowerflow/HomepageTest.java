package com.mszeles.selenide_tutorial.stackowerflow;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomepageTest {

    private final SelenideElement loginLink = $x("(//a[contains(@class, 'login-link')])[1]");
    private final SelenideElement signUpLink = $x("(//a[contains(@class, 'login-link')])[2]");
    private final SelenideElement aboutLink = $(byText("About"));
    private final SelenideElement acceptCookiesButton = $(byClassName("js-accept-cookies"));
    private final SelenideElement acceptCookieBanner = $("div.js-consent-banner");

    @BeforeMethod
    public void setup() {
        open("https://stackoverflow.com/");
    }

    @Test
    public void openPage() {
        loginLink.shouldBe(visible, enabled);
        signUpLink.shouldBe(visible, enabled);
        aboutLink.shouldHave(href("/company"));
    }

    @Test
    public void acceptCookies() {
        acceptCookiesButton.click();
        acceptCookieBanner.shouldBe(hidden);
    }
}
