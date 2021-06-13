package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String address;
  private final String home;

  public ContactData(String firstname, String middlename, String address, String home) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.address = address;
    this.home = home;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getAddress() {
    return address;
  }

  public String getHome() {
    return home;
  }
}
