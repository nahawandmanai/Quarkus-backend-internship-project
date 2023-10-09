package org.acme.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="pompe")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pompe extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPompe")
    private Long idPompe;
    private String nomPompe;
    private Date date;
    private String Nature ;
}
