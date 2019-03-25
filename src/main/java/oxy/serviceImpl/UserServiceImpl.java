package oxy.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import oxy.dao.UserMapper;
import oxy.dao.ext.ExtUserMapper;
import oxy.model.User;
import oxy.model.UserExample;
import oxy.model.UserExample.Criteria;
import oxy.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper UserMapper;
	@Override
	public User getUser(String account) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsercodeEqualTo(account);
		List<User> list = UserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	@Override
	public User login(String account, String password, String role) {
//		password = PasswordUtils.MD5(password);
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsercodeEqualTo(account);
		criteria.andPasswordEqualTo(password);
		criteria.andRoleEqualTo(role);
		// 未删除
		List<User> list = UserMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			User user = list.get(0);
			return user;
		} else {
//			throw new ServiceOperationException("用户名或密码有误，请重新输入");
			User user = null;
			return user;
		}
	}
	
	
}
