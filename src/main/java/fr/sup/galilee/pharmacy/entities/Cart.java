
package fr.sup.galilee.pharmacy.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
//cette classe est une entité JPA. Cela signifie que cette classe représente une table dans la base de données.
@Entity
//Lombok génèrent automatiquement les méthodes getter et setter pour tous les champs de cette classe.
@Getter
@Setter
public class Cart
{
    //le champ id est la clé primaire de cette entité.
    @Id
   // id sera automatiquement générée.
    @GeneratedValue(generator = "uuid")
    //'ID sera généré sous forme de chaîne UUID (identifiant unique universel) en version 2.
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    //stocke l'identifiant unique pour chaque Cart.
    private String id;
   //il existe une relation "un-à-un" entre cette entité Cart et une autre entité User.
   // Cela signifie qu'un seul utilisateur peut être associé à un seul panier, et vice-versa.
    @OneToOne

    //représente l'utilisateur associé à ce panier.
    private User user;

}
