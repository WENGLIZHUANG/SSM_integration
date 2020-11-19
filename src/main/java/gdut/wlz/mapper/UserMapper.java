package gdut.wlz.mapper;

import gdut.wlz.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: BUG_BOY
 * DATE:2020/11/18  10:52
 */
public interface UserMapper {

    /**
     * 查询所有用户的id、用户名、存款
     * @return
     */
    @Select("select * from usercount")
    /**@Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "money",property = "money")
    })*/
    public abstract List<User> findAll();
}
