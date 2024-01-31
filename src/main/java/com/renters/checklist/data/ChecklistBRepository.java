package com.renters.checklist.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistBRepository extends CrudRepository<ChecklistB, Long> {

}
