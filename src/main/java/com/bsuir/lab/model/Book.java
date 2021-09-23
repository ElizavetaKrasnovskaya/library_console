package com.bsuir.lab.model;

import javax.persistence.*;
import java.util.Objects;

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

    @Column(name = "is_taken")
    private boolean isTaken;

    @Column
    private String specification;

    public Book() {
    }

    public Book(String title, String genre, int yearOfPublishing, boolean isInReadingRoom, boolean isTaken, String specification) {
        this.title = title;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.isInReadingRoom = isInReadingRoom;
        this.isTaken = isTaken;
        this.specification = specification;
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

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPublishing == book.yearOfPublishing && isInReadingRoom == book.isInReadingRoom && isTaken == book.isTaken && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(specification, book.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, yearOfPublishing, isInReadingRoom, isTaken, specification);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isInReadingRoom=" + isInReadingRoom +
                ", isTaken=" + isTaken +
                ", specification='" + specification + '\'' +
                '}';
    }
}
