package life.majiang.community.community.model;

import lombok.Data;

/**
 * @Description
 * @Author chendong <dong.chen03@ucarinc.com>
 * @Version V1.0.0
 * @Date 2019/8/24
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}