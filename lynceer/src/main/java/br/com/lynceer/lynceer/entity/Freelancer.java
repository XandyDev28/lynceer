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
    private Integer idAluno;
    
    @Column(nullable = false, length = 40)
    private String nomeAluno;                             

    @OneToOne
    @JoinColumn(name = "idCurso_fk")
    private Usuario usuario;          /* futuramente criar a tabela do usuario */
    
}
