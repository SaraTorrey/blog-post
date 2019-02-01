package com.saratorrey.blog.restApp;

import org.joda.time.LocalDate;

public class BlogPost {

    public String title;
    public String body;
    public LocalDate date;

    public Author author;

    public String toHtml() {

       return "<h1>" + title + "</h1>" +
              "<h4>" + date.toString( "EEEE, MMMM dd yyyy" ) + "</h5>" +
              "<p>" + body + "</p>";
    }
}