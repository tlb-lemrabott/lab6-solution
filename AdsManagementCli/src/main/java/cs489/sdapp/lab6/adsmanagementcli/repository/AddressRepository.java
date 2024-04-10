package cs489.sdapp.lab6.adsmanagementcli.repository;

import cs489.sdapp.lab6.adsmanagementcli.model.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ListCrudRepository<Address, Integer> {
}
