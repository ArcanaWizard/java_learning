package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String address;
  private final String home;
  private String group;

  public ContactData(String firstname, String middlename, String address, String home, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.address = address;
    this.home = home;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
