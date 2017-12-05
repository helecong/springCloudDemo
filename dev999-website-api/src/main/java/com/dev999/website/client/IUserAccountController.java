package com.dev999.website.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev999.website.client.dto.UserAccountLoginRequest;
import com.dev999.website.client.dto.UserAccountResponse;

/**
 * 前台用户=用户访问接口
 * @author helecong
 *
 */
@FeignClient(value="useraccount-service")
public interface IUserAccountController {
	
	/**
	 * 用户登录操作
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/userAccount/login",method = RequestMethod.POST)
	UserAccountResponse login(UserAccountLoginRequest request);
}
