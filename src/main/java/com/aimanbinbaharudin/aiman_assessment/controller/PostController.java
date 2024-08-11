package com.aimanbinbaharudin.aiman_assessment.controller;
import com.aimanbinbaharudin.aiman_assessment.dto.PostResponseDTO;
import com.aimanbinbaharudin.aiman_assessment.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public PostResponseDTO[] getPosts(){
        return postService.getPosts();
    }

}
