package ru.stqa.pft.homework.model;

import java.util.Objects;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String title;
  private final String company;
  private final String home;
  private final String email;
  private String group;
  private int id;

  public ContactData(String firstname, String lastname, String title, String company, String home, String email, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstname = firstname;
    this.lastname = lastname;
    this.title = title;
    this.company = company;
    this.home = home;
    this.email = email;
    this.group = group;
  }

  public ContactData(int id, String firstname, String lastname, String title, String company, String home, String email, String group) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.title = title;
    this.company = company;
    this.home = home;
    this.email = email;
    this.group = group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public int getId() {
    return id;
  }

  public String getHome() {
    return home;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(firstname, that.firstname) &&
            Objects.equals(lastname, that.lastname);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstname, lastname);
  }

  public void setId(int id) {
    this.id = id;
  }
}
