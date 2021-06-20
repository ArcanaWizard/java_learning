package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTest extends TestBase {

  @Test

  public void testContactDeletion() {
    app.getContactHelper().returnHomePage();

    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("name1", "name2", "example@company.com", "88888888888", "test1"), true);
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContact(before - 1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertAccept();
    app.getContactHelper().returnHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }
}
