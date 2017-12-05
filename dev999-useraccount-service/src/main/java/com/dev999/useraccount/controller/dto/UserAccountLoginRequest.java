package com.dev999.useraccount.controller.dto;

/**
 * 请求参数
 * @author helecong
 *
 */
public class UserAccountLoginRequest {
	private String loginAccount;// 登录账户
	private String password;// 密码

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
