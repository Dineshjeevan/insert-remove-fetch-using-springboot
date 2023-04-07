package dinesh.idfcmock.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dinesh.idfcmock.dao.EmpDao;
import dinesh.idfcmock.dto.EmpDto;

@RestController
public class EmpController {
	
	@Autowired
	EmpDao dao;
	
	
	@PostMapping("/insert")
	public void insert(@RequestBody EmpDto dto ) {
		dao.insert(dto);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody EmpDto dto) {
	      String msg = dao.delete(dto);
          return msg;
	}
	
	@PostMapping("/fetch")
	public EmpDto fetch(@RequestBody EmpDto dto) {
	   EmpDto dto2= dao.fetch(dto);
		return dto2;
	}

}
