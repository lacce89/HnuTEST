package ateam.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ateam.dto.UserDTO;
import ateam.mapper.UserMapper;
import ateam.service.UserService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("userService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService{

	@Resource(name = "userMapper")
	private UserMapper mapper;
	
	@Override
	public UserDTO test() {
		// TODO Auto-generated method stub
		return mapper.test();
	}


	
}
