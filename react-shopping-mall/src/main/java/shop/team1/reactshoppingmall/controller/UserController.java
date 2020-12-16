package shop.team1.reactshoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.team1.reactshoppingmall.mapper.UserMapper;
import shop.team1.reactshoppingmall.vo.UserVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserMapper userMapper;
	
	@GetMapping
	public List<UserVO> userList() {
		System.out.println(userMapper.userList());
		return userMapper.userList();
	}
}
