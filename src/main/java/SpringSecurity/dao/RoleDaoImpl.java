package SpringSecurity.dao;

import java.util.List;
import SpringSecurity.model.Role;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void updateRole(Role role) {
        entityManager.merge(role);
    }


    @Override
    public void deleteRoleById(Long id) {
        entityManager.createQuery("delete from Role where id =:id", Role.class).setParameter("id", id).executeUpdate();
    }


    @Override
    public Role getRoleByName(String role) {
        return entityManager.createQuery("select u from Role u where u.role =:role", Role.class)
                .setParameter("role", role).getSingleResult();
    }
}



