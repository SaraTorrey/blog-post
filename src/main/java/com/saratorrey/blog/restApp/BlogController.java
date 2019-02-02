package com.saratorrey.blog.restApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

@SessionAttributes({"newBlog"})
@Controller
public class BlogController {

    @Resource
    BlogRepo blogRepo;

    @GetMapping( "/blogPost/{webTitle}" )
    public String index( @PathVariable String webTitle, Model model ) {

        BlogPost blogPost = blogRepo.findOneByWebTitle( webTitle );


        // Sends the blog object to the HTML so you can use it there.
        model.addAttribute( "blogPost", blogPost );

        return "index";
    }

    @GetMapping( "/blogList" )
    public String blogList( Model model ) {

        model.addAttribute( "blogList", blogRepo.findAllByOrderByTitle() );

        return "blogList";
    }

    // Go to page
    @GetMapping( "/addBlog" )
    public String addBlog( Model model ) {

        BlogPost blogPost = new BlogPost();
        blogPost.setTitle( "New Post" );
        blogPost.setWebTitle( "new-post" );
        blogPost.setBody( "This is my beautiful body! woot woot!" );
        model.addAttribute( "newBlog", blogPost );


        return "addBlog";
    }

    @PostMapping( "/saveBlog" )
    public String saveBlog(  @ModelAttribute("blogPost") BlogPost blogPost ,Model model ) {

        blogRepo.save( blogPost );

        return "redirect:/blogList";
    }
}