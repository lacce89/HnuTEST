package ateam.service;

import java.util.List;
import java.util.Map;

public interface AdminService {
	
	List<Map<String, Object>> selectCodeMst (Map<String, Object> param);
}
