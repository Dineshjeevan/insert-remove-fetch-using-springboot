package dinesh.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dinesh.idfcmock.dto.EmpDto;
import dinesh.idfcmock.repository.UserRepository;
@Component
public class EmpDao {

    @Autowired	
	UserRepository repository;
	public void insert(EmpDto dto) {
		repository.save(dto);
		
	}
	
	public String delete(EmpDto dto) {
	
		repository.delete(dto);
		return "data delete successfully";
	
	}
	
	public EmpDto fetch(EmpDto dto) {
	Optional<EmpDto> dto2=	repository.findById(dto.getEmpid());
	
	return dto2.get();

	}
	
	

}
