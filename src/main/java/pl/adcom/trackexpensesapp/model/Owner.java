package pl.adcom.trackexpensesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "first_name")
    @NotBlank(message = "Firstname is mandatory")
    private String FirstName;

    @Column(name = "last_name")
    @NotBlank(message = "LastName is mandatory")
    private String LastName;

    @OneToMany(mappedBy = "" ,cascade = CascadeType.ALL)
    private Set<Expanse> expanses;

}
