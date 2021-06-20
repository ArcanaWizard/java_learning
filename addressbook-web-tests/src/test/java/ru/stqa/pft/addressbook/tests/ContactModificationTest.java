package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().returnHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name1", "name2", "example@company.com", "88888888888", "test1"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().editContact(before.size() -1);
    app.getContactHelper().fillContactForm(new ContactData("name1", "name2", "example@company.com", "88888888888", null), false);
    app.getContactHelper().submitModification();
    app.getContactHelper().returnHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }
}
