package com.example.hngStage;


public class ResponseDto {
    public String email;
    public String current_datetime;
    public String github_url;

    public ResponseDto() {
    }
    public ResponseDto(String email, String current_datetime, String github_url) {
        this.email = email;
        this.current_datetime = current_datetime;
        this.github_url = github_url;
    }
}
