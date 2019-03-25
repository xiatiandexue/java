package oxy.service;

import java.util.List;
import java.util.Map;

import oxy.model.User;

public interface UserService {
	User getUser(String account);
	User login(String account, String password, String role);
}
