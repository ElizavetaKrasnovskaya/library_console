package com.bsuir.lab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Book> books;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public User() {
    }

    public User(String surname, String firstName, String middleName, String login, String password, Role role) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(surname, user.surname) && Objects.equals(firstName, user.firstName) && Objects.equals(middleName, user.middleName) && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(books, user.books) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, firstName, middleName, login, password, books, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", books=" + books +
                ", role=" + role +
                '}';
    }
}