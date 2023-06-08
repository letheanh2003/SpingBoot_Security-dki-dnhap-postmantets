package ra.model.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoleId")
    private int roleId;
    @Column(name = "RoleName")
    @Enumerated(EnumType.STRING)
    private ERole roleName;
}
