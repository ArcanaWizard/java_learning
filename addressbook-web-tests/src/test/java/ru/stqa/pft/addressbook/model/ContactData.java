package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id;
  private final String lastname;
  private final String firstname;
  private final String middlename;
  private final String address;
  private final String home;
  private String group;


  public ContactData(String lastname, String firstname, String middlename, String address, String home, String group) {
    this.id = Integer.MAX_VALUE;
    this.lastname = lastname;
    this.firstname = firstname;
    this.middlename = middlename;
    this.address = address;
    this.home = home;
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
    return firstname != null ? firstname.equals(that.firstname) : that.firstname == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", lastname='" + lastname + '\'' +
            ", firstname='" + firstname + '\'' +
            '}';
  }

  public ContactData(int id, String lastname, String firstname, String middlename, String address, String home, String group) {
    this.id = id;
    this.lastname = lastname;
    this.firstname = firstname;
    this.middlename = middlename;
    this.address = address;
    this.home = home;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public String getLastname() {
    return lastname;
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

  public void setId(int id) {
    this.id = id;
  }

}
