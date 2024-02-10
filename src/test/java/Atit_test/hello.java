package Atit_test;

import Base.Base_class;
import Pages.Contact_page;

public class hello extends Base_class {

    public static void main(String[] args) {
        Contact_page contactPage = new Contact_page(page);

        browser_launch("chromium", "https://atit.org.in/");
        contactPage.contact_form_filling();
    }

}
