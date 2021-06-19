package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().returnHomePage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("name1", "name2", "example@company.com", "88888888888"));
    app.getContactHelper().submitModification();
    app.getContactHelper().returnHomePage();
  }
}
