package shop.team1.reactshoppingmall.vo;

import java.util.Date;
import lombok.Data;

@Data
public class UserVO {
	Long id;
	String userID;
	String password;
	String userName;
	String phoneNum;
	String address;
	String regID;
	Date regDt;
	String modID;
	Date modDt;
}
