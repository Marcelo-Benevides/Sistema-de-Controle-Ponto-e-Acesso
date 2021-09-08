package com.dio.marcelo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}
