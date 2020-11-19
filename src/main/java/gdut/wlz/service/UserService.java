package gdut.wlz.service;

import gdut.wlz.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author: BUG_BOY
 * DATE:2020/11/18  11:09
 */
public interface UserService {

    /**
     * 查询用户的信息：id、用户名、存款
     * @return
     * @throws IOException
     */
    public abstract List<User> findAll() throws IOException;
}
