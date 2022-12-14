package com.konyang.springbootservice.domain.posts;

import com.konyang.springbootservice.web.dto.PostsUpdateRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        String title = "테스트 게시글";
        String contents = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .contents(contents)
                .author("fosehdwl@naver.com")
                .build());

        List<Posts> postsList = postsRepository.findAll();

       Posts posts = postsList.get(0);
       assertThat(posts.getTitle()).isEqualTo(title);
       assertThat(posts.getContents()).isEqualTo(contents);

    }
}
