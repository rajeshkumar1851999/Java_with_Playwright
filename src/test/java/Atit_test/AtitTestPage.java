package Atit_test;

import Base.Base_class;
import Pages.Contact_page;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

/**
 * Test class for Contact Page functionality using Playwright.
 */
@Epic("Playwright Tests")
@Feature("Contact Page")
public class AtitTestPage extends Base_class {

    /**
     * Test case for filling out the Contact Form.
     */
    @Test
    @Story("Filling Contact Form")
    @Severity(SeverityLevel.NORMAL)
    public void testContactForm() {
        // Instantiate Contact_page with the Playwright Page object
        Contact_page contactPage = new Contact_page(page);

        // Launch the browser and navigate to the specified URL
        browser_launch("chromium", "https://atit.org.in/");

        // Fill out the contact form
        contactPage.contact_form_filling();
    }
}
