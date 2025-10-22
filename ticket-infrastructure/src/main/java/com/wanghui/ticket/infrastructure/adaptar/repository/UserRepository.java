package com.wanghui.ticket.infrastructure.adaptar.repository;

import com.wanghui.ticket.domain.user.adapter.repository.IUserRepository;
import com.wanghui.ticket.domain.user.model.valobj.UserVO;
import com.wanghui.ticket.infrastructure.dao.UserMapper;
import com.wanghui.ticket.infrastructure.dao.po.UserPO;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class UserRepository implements IUserRepository {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserVO getUserByAccountName(String accountName) {
        UserPO userPO = userMapper.selectByAccountName(accountName);

        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userPO, userVO);
        return userVO;
    }
}