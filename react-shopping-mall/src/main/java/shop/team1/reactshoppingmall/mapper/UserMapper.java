package shop.team1.reactshoppingmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.team1.reactshoppingmall.vo.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> userList();
	UserVO fetchUserByID(Long id);
	void updateUser(UserVO user);
	void insertUser(UserVO user);
	void deleteUser(Long id);
}
