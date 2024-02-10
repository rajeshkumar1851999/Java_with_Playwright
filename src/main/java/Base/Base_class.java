package Base;

import com.microsoft.playwright.*;

/**
 * Base class for browser interaction using Playwright.
 */
public class Base_class {
    public static Page page;
    static Playwright playwright;
    static Browser browser;
    static BrowserContext browserContext;

    /**
     * Launches a specified browser and navigates to the given URL.
     *
     * @param browserName The name of the browser to launch (e.g., "chromium", "firefox", "webkit").
     * @param url The URL to navigate to after launching the browser.
     * @return The Page object representing the page in the browser.
     */
    public static Page browser_launch(String browserName, String url) {

        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "webkit":
                browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            default:
                System.out.println("Please insert the correct browser name: " + browserName);
                break;
        }

        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate(url);

        return page;
    }
}
