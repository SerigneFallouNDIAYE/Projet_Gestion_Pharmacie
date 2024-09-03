
package fr.sup.galilee.pharmacy.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Product
{

   // id est la clé primaire de l'entité Product
    @Id

    //id sera générée automatiquement par la base de données en utilisant la stratégie d'identité (GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //représente l'identifiant unique du produit
    private Long id;
    //représente l'identifiant unique du produit
    @Column(name = "name",nullable = false,unique = true)
   //Ce champ stocke le nom du produit
    private String name;
    // le champ prix est mappé à une colonne nommée "prix" dans la base de données.
    // Cette colonne ne peut pas être NULL, chaque produit doit avoir un prix.
    @Column(name = "prix", nullable = false)
    // représente le prix du produit.
    private float prix;
    //le champ quantity est mappé à une colonne nommée "quantity" dans la base de données.
    // Cette colonne peut être NULL par défaut, ce qui signifie que la quantité d'un produit peut être absente ou non définie.
    @Column(name = "quantity")
    //représente la quantité disponible du produit.
    private int quantity;
}
