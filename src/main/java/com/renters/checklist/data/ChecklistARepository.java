package com.renters.checklist.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistARepository extends CrudRepository<ChecklistA, Long> {

}
