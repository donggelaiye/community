package life.majiang.community.community.model;

import lombok.Data;

/**
 * @Description
 * @Author chendong <dong.chen03@ucarinc.com>
 * @Version V1.0.0
 * @Date 2019/9/23
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer likeCount;
    private Integer commentCount;
}
