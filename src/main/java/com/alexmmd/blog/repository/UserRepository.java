package com.alexmmd.blog.repository;

import com.alexmmd.blog.domain.User;

import java.util.List;

/**
 * description:
 * 用户资源接口
 *
 * @author 清风与明月
 * @create 2019-01-14 10:16
 */
public interface UserRepository {

    /**
     * 创建和修改用户
     *
     * @param user
     * @return
     */
    User saveOrUpateUser(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id查询单个用户
     *
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     *
     * @return
     */
    List<User> listUser();
}
