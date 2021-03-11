package max.yz.boot.basic.controller;

import lombok.extern.slf4j.Slf4j;
import max.yz.boot.basic.controller.dto.AjaxResponse;
import max.yz.boot.basic.entity.Article;
import max.yz.boot.basic.entity.ArticleReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author imyizai
 * @ClassName ArticleController
 * @Description
 * @Date 2021/3/11 7:37 下午
 **/

@RestController
@RequestMapping("/api/v1/articles")
@Slf4j
public class ArticleController {

    @GetMapping("all")
    public AjaxResponse selectArticles() {
        ArticleReader[] readers = {
                ArticleReader.builder()
                        .name("aaa")
                        .age(20)
                        .build(),
                ArticleReader.builder()
                        .name("bbb")
                        .age(19)
                        .build(),
        };
        List<ArticleReader> readerList = Arrays.asList(readers);
         Article article1 = Article.builder()
                 .id(123)
                 .author("imyizai")
                 .title("SpringBoot")
                 .content("SpringBoot从入门到精通")
                 .createTime(new Date())
                 .readers(readerList)
                 .build();
        Article article2 = Article.builder()
                .id(456)
                .author("imyizai")
                .title("Vue.js")
                .content("Vue.js从入门到精通")
                .createTime(new Date())
                .readers(readerList)
                .build();

        Article[] articles = {article1,article2};
        List<Article> articleList = Arrays.asList();

        return AjaxResponse.success(articleList);
    }

    @GetMapping("{id}")
    public AjaxResponse getArticle(@PathVariable int id) {
        Article article2 = Article.builder()
                .id(id)
                .author("imyizai")
                .title("Java")
                .content("Java")
                .createTime(new Date())
                .build();
        return AjaxResponse.success();
    }


}
