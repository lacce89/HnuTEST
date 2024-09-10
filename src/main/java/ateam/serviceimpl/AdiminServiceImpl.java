package ateam.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ateam.mapper.AdminMapper;
import ateam.service.AdminService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("AdminService")
public class AdiminServiceImpl extends EgovAbstractServiceImpl implements AdminService {

	@Resource(name = "AdminMapper")
	private AdminMapper mapper;
	
	@Override
	public List<Map<String, Object>> selectCodeMst(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return mapper.selectCodeMst(param);
	}

}
