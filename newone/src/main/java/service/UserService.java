package service;

import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.User;
import utils.SqlSessionFactoryUtils;

/**
 * @author HDH
 * @version 1.0
 */
public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public User login(String username,String password){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        org.apache.catalina.User user = mapper.select(username,password);
        sqlSession.close();
        return null;
    }
}
