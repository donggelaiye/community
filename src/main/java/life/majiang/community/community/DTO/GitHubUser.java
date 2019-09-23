package life.majiang.community.community.DTO;

import lombok.Data;
/**
 * @Description
 * @Author chendong <dong.chen03@ucarinc.com>
 * @Version V1.0.0
 * @Date 2019/8/23
 */
@Data
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
