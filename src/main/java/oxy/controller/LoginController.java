package oxy.controller;


import java.util.Date;

import javax.annotation.Resource;
import javax.security.auth.Subject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Result;
import org.apache.poi.ss.usermodel.DateUtil;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import oxy.dto.UserLoginDto;
import oxy.service.UserService;
import oxy.utils.JsonResult;
import oxy.vo.UserLoginVO;
@RestController
public class LoginController {
	@Resource
	private UserService userService;
	private String loginTime;
	String userCode;
	String name;
	String role;
	
	@RequestMapping("/login")
	public JsonResult login(@RequestBody UserLoginVO userLoginReq) {
//		if (Strings.isNullOrEmpty(userLoginReq.getAccount())) {
//			return new JsonResult(1,"用户名不能为空");
//		}
//		if (Strings.isNullOrEmpty(userLoginReq.getPassword())) {
//			return new JsonResult(1,"密码不能为空");
//		}
//		
//		
//		UserLoginDto userLoginResp = new UserLoginDto(userCode, name, loginTime, role);
//		userService.login(userLoginResp.getUserCode(),userLoginResp.getName(),userLoginResp.getRole());
//		
		return new JsonResult(0, "登录成功");
	}
}
