package com.renters.checklist.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceRepository extends CrudRepository<Advice,Long>{
// ABOVE:  The first variable is class type, the second is the type of the table id
	
}
