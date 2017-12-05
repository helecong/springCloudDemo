package com.dev999.useraccount.controller;

import com.dev999.useraccount.controller.dto.UserAccountLoginRequest;
import com.dev999.useraccount.controller.dto.UserAccountResponse;

/**
 * 前台用户=用户访问接口
 * @author helecong
 *
 */
public interface IUserAccountController {
	
	/**
	 * 用户登录操作
	 * @param request
	 * @return
	 */
	UserAccountResponse login(UserAccountLoginRequest request);
}
