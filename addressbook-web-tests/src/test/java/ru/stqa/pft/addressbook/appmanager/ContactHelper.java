package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.stqa.pft.addressbook.model.ContactData;

import java.time.Instant;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnHomePage() {
    click(By.linkText("home"));
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHome());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }


  public void selectContact() {
    click(By.xpath("//td/input"));
  }

  public void alertAccept() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
  }
}
