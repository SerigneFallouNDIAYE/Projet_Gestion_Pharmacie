
package fr.sup.galilee.pharmacy.entities;

import fr.sup.galilee.pharmacy.enums.UserProfile;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.EnumType.STRING;
// indique que cette classe est une entité JPA, ce qui signifie qu'elle sera mappée à une table dans la base de données.
@Entity
@Getter
@Setter
public class User
{
    //id est la clé primaire de l'entité User
    @Id
    //id sera générée automatiquement par la base de données en utilisant la stratégie IDENTITY,
    // ce qui signifie que l'ID sera auto-incrémenté.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //pour mappé le champ id à une colonne dans la base de données qui ne peut pas être NULL
    @Column(nullable = false)
    //représente l'identifiant unique de chaque utilisateur
    private Long id;
    //mappe le champ lastName à une colonne nommée "last_name" dans la base de données.
    @Column(name = "last_name", nullable = false)
   // représente le nom de famille de l'utilisateur.
    private String lastName;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "email", nullable = false,unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "active")
    private boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name = "profile", nullable = false)
    private UserProfile profile;
}
