package de.tekup.studentsabsence.repositories;

import de.tekup.studentsabsence.entities.Group;
import de.tekup.studentsabsence.entities.GroupSubject;
import de.tekup.studentsabsence.entities.GroupSubjectKey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupSubjectRepository extends CrudRepository<GroupSubject, GroupSubjectKey> {
    List<GroupSubject> findAllByGroup(Group id);
    GroupSubject findGroupSubjectByGroupIdAndSubjectId(Long gid,Long sid);
    ///TODO create a methode to find a groupSubject by Group Id and Subject Id
}
