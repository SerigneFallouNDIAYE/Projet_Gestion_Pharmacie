
package fr.sup.galilee.pharmacy.entities;
//mporte toutes les classes nécessaires de jakarta.persistence, qui est utilisée pour les annotations
// JPA (Java Persistence API) nécessaires pour la gestion de la persistance des entités.
import jakarta.persistence.*;

//importent les annotations de Lombok Getter et Setter, qui permettent de générer automatiquement les méthodes getter et setter
// pour les champs de la classe
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
public class Facture
{
    //id est la clé primaire de l'entité Facture
    @Id

    //id sera générée automatiquement, généralement en utilisant une séquence ou une stratégie d'auto-incrémentation par
    // la base de données.
    @GeneratedValue
    private Long id;

    //le champ value est mappé à une colonne nommée "value" dans la base de données. L'attribut nullable = false signifie
    // que cette colonne ne peut pas avoir de valeur NULL
    @Column(name = "value", nullable = false)
    private float value;
    @Column(name = "date", nullable = false)
    private Instant date;
   // il existe une relation "plusieurs-à-un" entre Facture et User
    @ManyToOne
    @JoinColumn(nullable = false)

    //Ce champ représente l'utilisateur auquel cette facture est associée
    private User user;

}
