package ateam.mapper;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("AdminMapper")
public interface AdminMapper {

	List<Map<String, Object>> selectCodeMst(Map<String, Object>param);
}
