package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(includeFieldNames = false)
@EqualsAndHashCode(exclude = "idFoyer")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne (mappedBy = "foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.PERSIST ,mappedBy = "foyer")
    private Set<Bloc> blocs;



}
