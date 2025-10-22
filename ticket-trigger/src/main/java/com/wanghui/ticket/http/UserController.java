package com.wanghui.ticket.http;


import com.wanghui.ticket.domain.user.model.valobj.UserVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wanghui.ticket.domain.user.service.IUserService;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @GetMapping("/getUser")
    public UserVO getUser(@RequestParam("accountName") String accountName) {
        log.info("UserController.getUser;[userId]={}", accountName);
        return userService.getUser(accountName);
    }
}