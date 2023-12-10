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

    public Voiture(Long id, String marque, String model, String matricule, Long id_client) {
        this.id = id;
        this.marque = marque;
        this.model = model;
        this.matricule = matricule;
        this.id_client = id_client;
    }

    public void setClientId(Long clientId) {
        this.id_client = clientId;
    }

    public Long getClientId() {
        return id_client;
    }
}
