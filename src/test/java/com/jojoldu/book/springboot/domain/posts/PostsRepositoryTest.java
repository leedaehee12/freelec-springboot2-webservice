package com.jojoldu.book.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

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
    public void 저장글_불러오기(){
        String title ="테스트_게시글";
        String content = "테스트_본문";

     postsRepository.save(Posts.builder().title(title).content(content).author("leedaehee").build());
    }
}
