
package fr.sup.galilee.pharmacy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//Getter et Setter de Lombok, qui permettent de générer automatiquement les méthodes getter et setter pour les champs de la classe.
import lombok.Getter;
import lombok.Setter;


// classe est une entité JPA, ce qui signifie qu'elle sera mappée à une table de la base de données.
@Entity
@Getter
@Setter
public class ProductCart
{

    //st la clé primaire de l'entité ProductCart. Chaque instance de ProductCart aura une valeur unique pour ce champ.
    @Id

    //id sera générée automatiquement par la base de données par autoincrementation
    @GeneratedValue

    // représente l'identifiant unique de chaque ProductCart
    private Long id;
    //représente la quantité du produit dans le panier
    private Integer quantity;

    //il existe une relation "plusieurs-à-un" entre ProductCart et Cart. Cela signifie qu'un panier (Cart) peut contenir
    // plusieurs instances de ProductCart, mais chaque ProductCart est associé à un seul panier.
    @ManyToOne
    //représente le panier auquel cette association ProductCart est liée
    private Cart cart;

    //il existe une relation "plusieurs-à-un" entre ProductCart et Product.
    // Cela signifie qu'un produit (Product) peut être présent dans plusieurs ProductCart, mais chaque ProductCart est associé à un seul produit.
    @ManyToOne

    //représente le produit associé à cette instance de ProductCart
    private  Product product;

}
