package com.saratorrey.blog.restApp;

import org.joda.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@SpringBootApplication
public class RestAppApplication {

	@Resource
	BlogRepo blogRepo;

	// Starts application
	public static void main(String[] args) {
		SpringApplication.run(RestAppApplication.class, args);
	}

	@PostConstruct
	private void loadData (){

		BlogPost blogPost = new BlogPost();
		blogPost.setTitle( "Yogurt and Spinach" );
		blogPost.setWebTitle( "yogurt-spinach" );
		blogPost.setBody( "Sauté a bag of spinach with some olive oils, salt, and pepper in a pan until" +
						  "most of the juices are evaporated and the spinach is soft and dark green." +
						  "Let the leaves cool down to room temperature, then add them to full-fat " +
						  "Greek yogurt. Mix them well using a stand mixer, or put it in food processor" +
						  "to get the spinach in tiny pieces. If there are little pieces are stringy spinach take" +
						  "them out individually. They can cause your baby to choke and feel uncomforatbale." );
		blogPost.setDate( new LocalDate( 2019, 1, 26 ) );
		blogRepo.save( blogPost );


		BlogPost secondPost = new BlogPost();
		secondPost.setTitle( "Lentils" );
		secondPost.setWebTitle( "lentils" );
		secondPost.setBody( "Lentils are an amazing source of fiber and protein. " +
							"They are very easy to make and all you need is salt water. " +
							"Soak the lentils for a few hours if you can; otherwise, wash " +
							"them and put them in a pot with plenty of salt water. Once the " +
							"entils are soft and the skin is coming off thy are ready. " +
							"And voila! You can feed your baby a very nutritious food." );
		secondPost.setDate( new LocalDate( 2019, 1, 27 ) );
		blogRepo.save( secondPost );


		BlogPost thirdPost = new BlogPost();
		thirdPost.setTitle( "Mashed Potatoes and Pork" );
		thirdPost.setWebTitle( "mashed-potatoes-pork" );
		thirdPost.setBody( "We barbecued some pork ribs last night and made some mashed potatoes." +
						   "Before adding the cream to the potatoes I got a few pieces out, took the skins" +
						   "off and mashed them with a fork. Then I added some full-fat Greek yogurt, a little butter, salt," +
						   "pepper, and dried dills. Once the meat was fully cooked I cut a piece and chopped" +
						   "it very finely and added it to the potatoes." );
		thirdPost.setDate( new LocalDate( 2019, 1, 28 ) );
		blogRepo.save( thirdPost );


		BlogPost forthPost = new BlogPost();
		forthPost.setTitle( "Oatmeal and Prunes" );
		forthPost.setWebTitle( "oatmeal-prunes" );
		forthPost.setBody( "Cook some ooatmeal, mix with prunes. There ya go!" );
		forthPost.setDate( new LocalDate( 2019, 2, 2 ) );
		blogRepo.save( forthPost );

	}





}

