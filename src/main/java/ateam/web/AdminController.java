package ateam.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.uiadapter17.spring.core.annotation.ParamDataSet;
import com.nexacro.uiadapter17.spring.core.data.NexacroResult;

import ateam.service.AdminService;

@Controller
public class AdminController {
	private Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Resource(name="txManager")
	PlatformTransactionManager transationManager;
	
	@Resource(name = "AdminService")
	private AdminService service;
	
	@RequestMapping(value = "/selectCodeMst.do")
	public NexacroResult selectCodMst(@ParamDataSet(name = "ds_Search", required = false) Map<String, Object>param) {
		
		NexacroResult result = new NexacroResult();
		
		System.out.println(param);
		
		try {
			List<Map<String, Object>> ds_CodeMstList = service.selectCodeMst(param);
					
					result.addDataSet("ds_CodeMstList", ds_CodeMstList);
		} catch(Exception ee) {
			System.out.println(ee);
			result.setErrorCode(01);
			result.setErrorMsg("catch 조회 오류");
		}
		
		return result;
	}
}
