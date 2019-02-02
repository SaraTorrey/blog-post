package com.saratorrey.blog.restApp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogRepo extends PagingAndSortingRepository<BlogPost, Long> {

    BlogPost findOneByWebTitle( String title );
    List<BlogPost> findAllByOrderByTitle( );
}