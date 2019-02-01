package com.saratorrey.blog.restApp;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {


    @RequestMapping( "/" )
    public String index( Model model) {

        BlogPost blogPost = new BlogPost();
        blogPost.title = "Yogurt and Spinach";
        blogPost.body = "Sauté a bag of spinach with some olive oils, salt, and pepper in a pan until" +
                         "most of the juices are evaporated and the spinach is soft and dark green." +
                         "Let the leaves cool down to room temperature, then add them to full-fat " +
                         "Greek yogurt. Mix them well using a stand mixer, or put it in food processor" +
                         "to get the spinach in tiny pieces. If there are little pieces are stringy spinach take" +
                        "them out individually. They can cause your baby to choke and feel uncomforatbale.";
        blogPost.date = new LocalDate( 2019, 1, 26 );

        Author firstAuthor = new Author();
        firstAuthor.name = "Sara Torrey";
        firstAuthor.title = "Master Chef";

        blogPost.author = firstAuthor;

        // Sends the blog object to the HTML so you can use it there.
        model.addAttribute( "blogPost", blogPost );

        return "index";
    }

    private String blogPosts() {


        BlogPost secondPost = new BlogPost();
        secondPost.title = "Lentils";
        secondPost.body = "Lentils are an amazing source of fiber and protein. " +
                          "They are very easy to make and all you need is salt water. " +
                          "Soak the lentils for a few hours if you can; otherwise, wash " +
                          "them and put them in a pot with plenty of salt water. Once the " +
                          "entils are soft and the skin is coming off thy are ready. " +
                          "And voila! You can feed your baby a very nutritious food.";
        secondPost.date = new LocalDate( 2019, 1, 27 );

        BlogPost thirdPost = new BlogPost();
        thirdPost.title = "Mashed Potatoes and Pork";
        thirdPost.body = "We barbecued some pork ribs last night and made some mashed potatoes." +
                         "Before adding the cream to the potatoes I got a few pieces out, took the skins" +
                         "off and mashed them with a fork. Then I added some full-fat Greek yogurt, a little butter, salt," +
                         "pepper, and dried dills. Once the meat was fully cooked I cut a piece and chopped" +
                         "it very finely and added it to the potatoes.";
        thirdPost.date = new LocalDate( 2019, 1, 28 );

        Dog nino = new Dog();
        nino.name = "nino";
        nino.age = 6;

        return  secondPost.toHtml() + thirdPost.toHtml();
    }


}