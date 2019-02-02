package com.saratorrey.blog.restApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class BlogController {

    @Resource
    BlogRepo blogRepo;

    @RequestMapping( "/blogPost/{webTitle}" )
    public String index( @PathVariable String webTitle, Model model ) {

        BlogPost blogPost = blogRepo.findOneByWebTitle( webTitle );


        // Sends the blog object to the HTML so you can use it there.
        model.addAttribute( "blogPost", blogPost );

        return "index";
    }

    @RequestMapping( "/blogList" )
    public String blogList( Model model ) {

        model.addAttribute( "blogList", blogRepo.findAll() );

        return "blogList";
    }
}