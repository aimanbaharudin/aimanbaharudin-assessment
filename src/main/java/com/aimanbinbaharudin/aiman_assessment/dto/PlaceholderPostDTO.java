package com.aimanbinbaharudin.aiman_assessment.dto;

import jakarta.persistence.Id;

public class PlaceholderPostDTO {

    @Id
    private Long id;
    private int userid;
    private String title;
    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public PlaceholderPostDTO(Long id, int userid, String title, String body) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.body = body;
    }

    public PlaceholderPostDTO() {
    }
}
