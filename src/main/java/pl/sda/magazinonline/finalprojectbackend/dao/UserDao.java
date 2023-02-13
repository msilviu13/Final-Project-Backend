package pl.sda.magazinonline.finalprojectbackend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.magazinonline.finalprojectbackend.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
