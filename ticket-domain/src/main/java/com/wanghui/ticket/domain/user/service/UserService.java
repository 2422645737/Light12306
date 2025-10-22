package com.wanghui.ticket.domain.user.service;


import com.wanghui.ticket.domain.user.adapter.repository.IUserRepository;
import com.wanghui.ticket.domain.user.model.valobj.UserVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @fileName: UserService
 * @author: wanghui
 * @createAt: 2025/10/22 07:56:22
 * @updateBy:
 * @copyright:
 */

@Service
public class UserService implements IUserService{

    @Resource
    IUserRepository userRepository;

    @Override
    public UserVO getUser(String accountName) {
        return userRepository.getUserByAccountName(accountName);
    }
}