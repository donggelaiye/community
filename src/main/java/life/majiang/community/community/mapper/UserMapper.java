package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Author chendong <dong.chen03@ucarinc.com>
 * @Version V1.0.0
 * @Date 2019/8/24
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
     void insert(User user);
    @Select("select *from user where token=#{token}")
    User findByToken(@Param("token") String token);
    @Select("select *from user where id=#{id}")
    User findById(@Param("id") Integer id);
}
