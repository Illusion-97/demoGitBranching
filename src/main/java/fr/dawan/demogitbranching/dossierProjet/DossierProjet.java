package fr.dawan.demogitbranching.dossierProjet;

import fr.dawan.demogitbranching.generic.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DossierProjet extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private LocalDate createdAt;
}
