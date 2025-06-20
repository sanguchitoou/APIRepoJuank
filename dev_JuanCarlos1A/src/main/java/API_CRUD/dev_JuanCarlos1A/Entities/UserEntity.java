package API_CRUD.dev_JuanCarlos1A.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "TBUSUARIO")
@Getter @Setter @ToString @EqualsAndHashCode
public class UserEntity {
    
    @Id @Column(name = "IDUSUARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
    private Long id;
    @Column(name = "NOMBRE")
    private String firstName;
    @Column(name = "APELLIDO")
    private String lastName;
    @Column(name = "IDGRUPOEXPO")
    private Long idExpoGroup;
    @Column(name = "IDROL")
    private Long idRol;
    @Column(name = "CORREO", unique = true)
    private String email;
    @Column(name = "CONTRASENA")
    private String password;
    @Column(name = "IDCARGO")
    private Long idPosition;
}
