package com.WFZY.service.Impl;

import java.util.List;

import javax.security.auth.spi.LoginModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WFZY.mapper.UsersMapper;
import com.WFZY.pojo.Users;
import com.WFZY.pojo.UsersExample;
import com.WFZY.service.loginService;
@Service("loginServiceImpl")
public class loginServiceImpl implements loginService{
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public int selectUserLogin(String logoinName, String loginPwd) {
		UsersExample example = new UsersExample();
		example.createCriteria().andUserphoneEqualTo(logoinName).andLoginpwdEqualTo(loginPwd);
		List<Users> user = this.usersMapper.selectByExample(example);
		if (user.size() != 0)
			return user.get(0).getUserid();
		return user.size(); // 返回查到 账户相同并密码相同 的用户id，等于0即用户不存在
	}
	
	// 根据ID查用户
		@Override
		public Users selectUser(Integer id) {
			Users user = this.usersMapper.selectByPrimaryKey(id);
			return user;
		}
	
}
