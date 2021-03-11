package max.yz.boot.basic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author imyizai
 * @ClassName Article
 * @Description： 文章
 * @Date 2021/3/11 7:28 下午
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private  Integer id;
    private  String author;
    private  String title;
    private  String content;
    private  Date   createTime;
    private List<ArticleReader> readers;


}
