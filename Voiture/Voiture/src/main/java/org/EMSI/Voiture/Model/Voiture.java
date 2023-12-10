package org.EMSI.Voiture.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String model;
    private String matricule;
    private Long id_client;
    @Transient
    @ManyToOne
    private Client client;


}
