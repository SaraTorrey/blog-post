package com.saratorrey.blog.restApp;

public class Author {
    public String name;
    public String title;

    public String toHtml() {

        return "<h3>" + name + "</h3>" +
               "<p>" + title + "</p>";
    }

}