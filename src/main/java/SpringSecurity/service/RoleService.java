package SpringSecurity.service;

import SpringSecurity.model.Role;
import java.util.List;


public interface RoleService {

    List<Role> getAllRoles();

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRoleById(Long id);

    Role getRoleByName(String role);
}
