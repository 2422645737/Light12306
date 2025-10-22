package com.wanghui.ticket.infrastructure.dao;

import com.wanghui.ticket.infrastructure.dao.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    UserPO selectByAccountName(@Param("accountName") String accountName);

}