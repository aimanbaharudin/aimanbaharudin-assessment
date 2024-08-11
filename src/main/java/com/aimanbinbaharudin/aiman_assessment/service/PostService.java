package com.aimanbinbaharudin.aiman_assessment.service;

import com.aimanbinbaharudin.aiman_assessment.dto.PlaceholderPostDTO;
import com.aimanbinbaharudin.aiman_assessment.dto.PostResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {
    @Autowired
    private final RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PostResponseDTO[] getPosts() {
        PlaceholderPostDTO[] placeholders = getPlaceholderPosts();
        String longestTitle = "";
        String longestBody = "";
        PostResponseDTO[] response = new PostResponseDTO[placeholders.length];
        for (int i = 0; i < placeholders.length; i++) {
            PlaceholderPostDTO placeholder = placeholders[i];
            if(placeholder.getTitle().length() > longestTitle.length()){
                longestTitle = placeholder.getTitle();
                longestBody = placeholder.getBody();
            }
            PostResponseDTO post = new PostResponseDTO(placeholder.getId(), placeholder.getUserid(), placeholder.getTitle(), placeholder.getBody());
            response[i] = post;
        }
        System.out.println("Title: " + longestTitle);
        System.out.println("Body: " + longestBody);

        return response;

    }

    public PlaceholderPostDTO[] getPlaceholderPosts(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.getForObject(url, PlaceholderPostDTO[].class);
    }




}
