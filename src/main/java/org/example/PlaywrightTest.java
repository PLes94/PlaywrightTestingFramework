package org.example;

import com.microsoft.playwright.*;

public class PlaywrightTest {

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false)
                    .setSlowMo(50));
            Page page = browser.newPage();
            BrowserContext context = browser.newContext();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
    }
}
