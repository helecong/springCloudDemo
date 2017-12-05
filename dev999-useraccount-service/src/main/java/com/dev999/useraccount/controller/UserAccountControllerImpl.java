package com.dev999.useraccount.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev999.useraccount.controller.dto.UserAccountLoginRequest;
import com.dev999.useraccount.controller.dto.UserAccountResponse;

/**
 * 用户账户 controller
 * @author helecong
 *
 */
@RestController
@RequestMapping(path="/userAccount")
public class UserAccountControllerImpl implements IUserAccountController {

	@Override
	@RequestMapping(path="/login",method = RequestMethod.POST)
	public UserAccountResponse login(UserAccountLoginRequest request) {
		UserAccountResponse response = new UserAccountResponse();
		response.setName(request.getLoginAccount()+" - "+request.getPassword());
		System.out.println("sss"+request.getLoginAccount());
		return response;
	}

}
