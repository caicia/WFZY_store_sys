package com.WFZY.service;

import com.WFZY.pojo.Users;

public interface loginService {

	public int selectUserLogin(String logoinName, String loginPwd);

	public Users selectUser(Integer id);

}
