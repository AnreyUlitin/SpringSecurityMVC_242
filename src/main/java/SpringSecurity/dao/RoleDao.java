package SpringSecurity.dao;

import java.util.List;
import SpringSecurity.model.Role;


public interface RoleDao {

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRoleById(Long id);

    List<Role> getAllRoles();

    Role getRoleByName(String role);
}