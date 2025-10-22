package com.wanghui.ticket.domain.user.service;


import com.wanghui.ticket.domain.user.model.valobj.UserVO;

/**
 * @description:
 * @fileName: UserService
 * @author: wanghui
 * @createAt: 2025/10/22 07:37:10
 * @updateBy:
 * @copyright:
 */

public interface IUserService {

    /**
     * 通过账户名检索用户信息
     * @param accountName 账户名称，可能是手机号、邮箱、用户名
     * @return {@link String }
     */

    UserVO getUser(String accountName);

}