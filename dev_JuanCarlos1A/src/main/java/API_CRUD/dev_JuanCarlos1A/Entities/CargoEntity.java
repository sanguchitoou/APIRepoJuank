package API_CRUD.dev_JuanCarlos1A.Entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TBCARGO")
@Getter @Setter @ToString @EqualsAndHashCode
public class CargoEntity {

    @Id @Column(name = "IDCARGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cargo")
    @SequenceGenerator(name = "seq_cargo", sequenceName = "seq_cargo", allocationSize = 1)
    private Long id;
    @Column(name = "CARGO")
    private String cargo;
}
