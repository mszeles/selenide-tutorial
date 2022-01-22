package com.mszeles.selenide_tutorial.stackowerflow;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomepageTest {

    private final SelenideElement loginButton = $x("(//a[contains(@class, 'login-link')])[1]");
    private final SelenideElement signUpButton = $x("(//a[contains(@class, 'login-link')])[2]");

    @Test
    public void openPage() {
        open("https://stackoverflow.com/");
        loginButton.shouldBe(visible).shouldBe(enabled);
        signUpButton.shouldBe(visible).shouldBe(enabled);
    }
}
