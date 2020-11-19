package gdut.wlz.service.impl;

import gdut.wlz.domain.User;
import gdut.wlz.mapper.UserMapper;
import gdut.wlz.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: BUG_BOY
 * DATE:2020/11/18  11:10
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAll() throws IOException {
        //原始的整合方法
        /*InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = factoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();
        //获取动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAll();
        *//*提交事务并释放资源*//*
        sqlSession.commit();
        sqlSession.close();
        return userList;*/

        List<User> userList = userMapper.findAll();
        //新的整合思路：将session工厂对象交给spring创建
        return userList;

    }
}
