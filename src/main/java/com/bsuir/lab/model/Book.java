package com.bsuir.lab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "year_of_publishing")
    private int yearOfPublishing;

    @Column(name = "is_in_reading_room")
    private boolean isInReadingRoom;

    @Column(name = "specification")
    private String specification;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    public Book() {
    }

    public Book(String title, String genre, int yearOfPublishing, boolean isInReadingRoom, String specification, Set<Author> authors) {
        this.title = title;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.isInReadingRoom = isInReadingRoom;
        this.specification = specification;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public boolean isInReadingRoom() {
        return isInReadingRoom;
    }

    public void setInReadingRoom(boolean inReadingRoom) {
        isInReadingRoom = inReadingRoom;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPublishing == book.yearOfPublishing && isInReadingRoom == book.isInReadingRoom && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(specification, book.specification) && Objects.equals(user, book.user) && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, yearOfPublishing, isInReadingRoom, specification, user, authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isInReadingRoom=" + isInReadingRoom +
                ", specification='" + specification + '\'' +
                ", user=" + user +
                ", authors=" + authors +
                '}';
    }
}
