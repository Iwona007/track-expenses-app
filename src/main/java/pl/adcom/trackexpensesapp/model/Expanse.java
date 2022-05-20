package pl.adcom.trackexpensesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

@Entity
@Data
@NoArgsConstructor
@Table(name = "expanse")
public class Expanse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "Expanse name is mandatory")
    private String Name;

    @NotBlank(message = "Amount is mandatory")
    private BigDecimal Amount;

    @Column(name = "expanse_date")
    private LocalDateTime expanseDate;

    @NotBlank(message = "Currency is mandatory")
    private Currency currency;

    @ManyToOne
    private Owner owner;
}
