package com.pratyush.blogapp.comments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles/{articles-slug}/comments")
public class CommentsController {
    @GetMapping("")
    public String getComments(){
        return "comments";
    }
}
