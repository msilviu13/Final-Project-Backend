package pl.sda.magazinonline.finalprojectbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.magazinonline.finalprojectbackend.dao.RoleDao;
import pl.sda.magazinonline.finalprojectbackend.entity.Role;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
