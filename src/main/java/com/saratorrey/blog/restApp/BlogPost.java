package com.saratorrey.blog.restApp;

import org.joda.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    public Long id;

    private String title; // Spinach and Yogurt
    private String webTitle; // spinach-yogurt

    @Column(length = 1024)
    private String body;
    private LocalDate date;

    private Long getId() {

        return id;
    }

    public void setId( Long id ) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle( String title ) {

        this.title = title;
    }

    public String getWebTitle() {

        return webTitle;
    }

    public void setWebTitle( String webTitle ) {

        this.webTitle = webTitle;
    }

    public String getBody() {

        return body;
    }

    public void setBody( String body ) {

        this.body = body;
    }

    public LocalDate getDate() {

        return date;
    }

    public void setDate( LocalDate date ) {

        this.date = date;
    }

    public String toHtml() {

       return "<h1>" + title + "</h1>" +
              "<h4>" + date.toString( "EEEE, MMMM dd yyyy" ) + "</h5>" +
              "<p>" + body + "</p>";
    }
}