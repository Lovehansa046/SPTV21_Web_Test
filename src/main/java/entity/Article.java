package entity;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Date;
@Entity
public class Article implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String caption;
    private String text;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToOne
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", author=" + author.getFirstname() +
                " " + author.getLastname() +
                '}';
    }
}
