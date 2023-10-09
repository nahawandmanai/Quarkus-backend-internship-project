package org.acme.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="citerne")

public class citerne extends PanacheEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCiterne")
    private Long idCiterne;

    @Column
    private String nomCiterne;
    @Column
    private Integer quantity;
    @Column
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    @Column
    private nature Nature ;

}
