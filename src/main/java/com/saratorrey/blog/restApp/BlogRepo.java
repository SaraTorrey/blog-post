package com.saratorrey.blog.restApp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface BlogRepo extends PagingAndSortingRepository<BlogPost, Long> {

    BlogPost findOneByWebTitle( String title );
}