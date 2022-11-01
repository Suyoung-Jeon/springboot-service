package com.konyang.springbootservice.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String contents;

    @Builder
    public  PostsUpdateRequestDto(String title, String contents)
    {
        this.title = title;
        this.contents = contents;
    }
}
