package jayks.com.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jayks.com.user.mapper.UserMapper;
import jayks.com.user.service.UserService;
import jayks.com.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserVO> getUserList() {
		
		log.info("getUserList 임플 통과 확인 {}");
		
		return userMapper.getUserList();
	}
}
