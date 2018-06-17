package cn.daycode.repository;

import cn.daycode.core.annotation.BindEntity;
import cn.daycode.core.orm.Repository;
import cn.daycode.entity.User;

@BindEntity(User.class)
public interface UserRepository extends Repository<User, Long> {
}
