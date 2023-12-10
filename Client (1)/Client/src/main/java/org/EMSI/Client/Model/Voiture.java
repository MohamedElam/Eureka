package org.EMSI.Client.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    private Long id;
    private String marque;
    private String model;
    private String matricule;
}
