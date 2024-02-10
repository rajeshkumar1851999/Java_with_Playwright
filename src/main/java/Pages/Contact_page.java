package Pages;

import Base.Base_class;
import Locators.Contact_page_locators;
import com.microsoft.playwright.Page;

/**
 * Page class for interacting with the Contact page.
 */
public class Contact_page extends Base_class {

    private Contact_page_locators contactPageLocators = new Contact_page_locators();

    /**
     * Constructor for the Contact_page class.
     *
     * @param page The Playwright Page object associated with the Contact page.
     */
    public Contact_page(Page page) {
        this.page = page;
    }

    /**
     * Fills out the contact form with sample data.
     */
    public void contact_form_filling() {
        this.page.fill(contactPageLocators.name, "Rajeshkumar");
        this.page.fill(contactPageLocators.mailid, "rkumar123@gmail.com");
        this.page.fill(contactPageLocators.phnumber, "9876543210");
        this.page.fill(contactPageLocators.message, "This is for testing");
    }
}
