package com.mszeles.selenide_tutorial.stackowerflow;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomepageTest {

    private final SelenideElement loginLink = $x("(//a[contains(@class, 'login-link')])[1]");
    private final SelenideElement signUpLink = $x("(//a[contains(@class, 'login-link')])[2]");
    private final SelenideElement aboutLink = $(byText("About"));

    @Test
    public void openPage() {
        open("https://stackoverflow.com/");
        loginLink.shouldBe(visible).shouldBe(enabled);
        signUpLink.shouldBe(visible).shouldBe(enabled);
        aboutLink.shouldHave(href("/company"));
    }

}
