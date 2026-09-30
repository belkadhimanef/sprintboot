package tn.esprit.manef_belkadhi_4sssa3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.manef_belkadhi_4sssa3.enums.CategorieVehicule;
import tn.esprit.manef_belkadhi_4sssa3.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "vehicule")
    private Set<Maintenance> maintenances;

    @ManyToMany
    private Set<Equipement> equipements;

    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations;
}
