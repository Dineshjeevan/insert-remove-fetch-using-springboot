package dinesh.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dinesh.idfcmock.dto.EmpDto;

public interface UserRepository extends JpaRepository<EmpDto, Integer>{

}
