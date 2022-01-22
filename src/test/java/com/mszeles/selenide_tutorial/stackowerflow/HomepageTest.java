package com.mszeles.selenide_tutorial.stackowerflow;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomepageTest {

    @Test
    public void openPage() {
        open("https://stackoverflow.com/");
        $x("(//a[contains(@class, 'login-link')])[1]").shouldBe(visible);
        $x("(//a[contains(@class, 'login-link')])[1]").shouldBe(enabled);
        $x("(//a[contains(@class, 'login-link')])[2]").shouldBe(visible);
        $x("(//a[contains(@class, 'login-link')])[2]").shouldBe(enabled);
    }
}
