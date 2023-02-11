package mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author HDH
 * @version 1.0
 */
public interface UserMapper {
    @Select("select * from t_user where username = #{username} and password = #{password}")
    User select(@Param("username")String username,@Param("password")String password);

    @Select("select * from t_user where username = #{username}")
    User selectByUserName(String username);

    @Insert("insert into t_user values(null,#{username},#{password})")
    void add(User user);
}
