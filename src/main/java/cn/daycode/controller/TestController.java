package cn.daycode.controller;

import cn.daycode.entity.User;
import cn.daycode.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private UserRepository userRepository;

    @RequestMapping("save")
    public void save() {
        User user = new User();
        user.setName("abc");
        user.setSex(1);
        userRepository.save(user);
    }

    @RequestMapping("findById")
    public User findById(Long id) {
        return userRepository.findById(id);
    }

}
