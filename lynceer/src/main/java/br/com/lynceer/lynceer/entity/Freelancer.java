package br.com.lynceer.lynceer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Freelancer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idFreelas;

    @Column(nullable = false, length = 40)
    private String categoryFreelas;

    @Column(nullable = false, length = 80)
    private String descriptionFreelas;

    @OneToOne
    @JoinColumn(name = "fk_idUser")
    private User user;

}
