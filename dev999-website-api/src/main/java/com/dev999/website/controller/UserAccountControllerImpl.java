package com.dev999.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev999.website.client.IUserAccountController;
import com.dev999.website.client.dto.UserAccountLoginRequest;
import com.dev999.website.client.dto.UserAccountResponse;

/**
 * 用户账户 controller
 * @author helecong
 *
 */
@RestController
@RequestMapping(path="/userAccount")
public class UserAccountControllerImpl implements IUserAccountController {

	@Autowired
	private IUserAccountController userAccount;
	
	@Override
	@RequestMapping(path="/login")
	public UserAccountResponse login(UserAccountLoginRequest request) {
		request.setLoginAccount("1231");
		return userAccount.login(request);
	}

}
