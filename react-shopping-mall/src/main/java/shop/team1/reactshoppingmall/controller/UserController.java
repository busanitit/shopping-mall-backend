package shop.team1.reactshoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return userMapper.userList();
	}
	
	@GetMapping("/{id}")
	public UserVO fetchUserByID(@PathVariable Long id) {
		return userMapper.fetchUserByID(id);
	}
	
	@PostMapping
	public void insertUser(@RequestBody UserVO user) {
		userMapper.insertUser(user);
		System.out.println("유저 데이터 저장");
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userMapper.deleteUser(id);
		System.out.println("유저아이디: " + id + ", 유저 데이터 삭제");
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody UserVO user) {
		userMapper.updateUser(user);
	}
}
