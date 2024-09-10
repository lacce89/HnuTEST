package ateam.mapper;

import ateam.dto.UserDTO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userMapper")
public interface UserMapper{
	UserDTO test();
}
