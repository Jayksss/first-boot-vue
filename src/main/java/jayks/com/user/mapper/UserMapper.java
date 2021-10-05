package jayks.com.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jayks.com.user.vo.UserVO;

@Mapper
public interface UserMapper {
	
	List<UserVO> getUserList();
}
