package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("name1", "name2", "example@company.com", "88888888888"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnHomePage();
  }


}
