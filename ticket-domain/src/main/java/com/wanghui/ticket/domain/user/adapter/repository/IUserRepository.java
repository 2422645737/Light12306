package com.wanghui.ticket.domain.user.adapter.repository;

import com.wanghui.ticket.domain.user.model.valobj.UserVO;

/**
 * @description:
 * @fileName: IUserRepository
 * @author: wanghui
 * @createAt: 2025/10/22 08:11:19
 * @updateBy:
 * @copyright:
 */

public interface IUserRepository {

    /**
     * 通过用户名获取用户信息
     * @param accountName
     * @return {@link UserVO }
     */

    UserVO getUserByAccountName(String accountName);
}