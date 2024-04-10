package cs489.sdapp.lab6.adsmanagementcli.repository;

import cs489.sdapp.lab6.adsmanagementcli.model.Surgery;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends ListCrudRepository<Surgery, Integer> {
}
