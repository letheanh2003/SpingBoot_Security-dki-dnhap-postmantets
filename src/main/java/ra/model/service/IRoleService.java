package ra.model.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.model.entity.ERole;
import ra.model.entity.Roles;
import ra.model.entity.Users;

import java.util.Optional;

public interface IRoleService {
    Optional<Roles> findByRoleName(ERole roleName);
}
