package rocha.bruno.exemploH2MySQL.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocha.bruno.exemploH2MySQL.model.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}