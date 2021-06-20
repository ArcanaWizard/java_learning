package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("name1", "name2", "example@company.com", "88888888888", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
