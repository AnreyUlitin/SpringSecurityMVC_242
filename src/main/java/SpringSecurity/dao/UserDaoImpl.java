package SpringSecurity.dao;

import java.util.List;
import SpringSecurity.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

        @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

   @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUserById(Long id) {
        entityManager.createQuery("delete from User o where o.id=:id").setParameter("id", id).executeUpdate();
    }

     @Override
    public User getUserByName(String username) {
        return entityManager.createQuery("select u from User u where u.username =: username",
                User.class).setParameter("username", username).getSingleResult();
    }
}





