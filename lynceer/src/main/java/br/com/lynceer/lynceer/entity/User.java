package br.com.lynceer.lynceer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUser;
    
    @Column(nullable = false, length = 40)
    private String nameUser; 
    
    @Column(nullable = false, length = 40)
    private String emailUser;

    @Column(nullable = false, length = 11)
    private String cpfUser;

    @Column(nullable = false, length = 40)
    private String adresslUser;

    @Column(nullable = false, length = 15)
    private String tellUser;

    private Integer ageUser;

    private Integer passwordUser;
}
