package com.aimanbinbaharudin.aiman_assessment.tests;

import com.aimanbinbaharudin.aiman_assessment.dto.PlaceholderPostDTO;
import com.aimanbinbaharudin.aiman_assessment.dto.PostResponseDTO;
import com.aimanbinbaharudin.aiman_assessment.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PostTests {
    @Autowired
    private PostService postService;


    @Test
    public void getPlaceholder_returnPlaceholderPosts(){

        PlaceholderPostDTO[] placeholders = postService.getPlaceholderPosts();

        Assertions.assertNotNull(placeholders);
        Assertions.assertTrue(placeholders.length > 0);

    }

    @Test
    public void getResponseDTO_returnResponseDTO(){
        PostResponseDTO[] response = postService.getPosts();
        Assertions.assertNotNull(response);
        for (int i=0; i<response.length; i++) {
            Assertions.assertTrue(response[i].getTitleLength() > 0);
            Assertions.assertNotNull(response[i].getId());
            Assertions.assertNotNull(response[i].getUserid());
            Assertions.assertNotNull(response[i].getTitle());
            Assertions.assertNotNull(response[i].getBody());
        }
    }



}
