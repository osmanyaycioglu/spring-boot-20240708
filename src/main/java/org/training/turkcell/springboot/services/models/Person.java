package org.training.turkcell.springboot.services.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "kisi")
public class Person {
    @Id
    @GeneratedValue
    private Long personId;
    @Column(name = "puid",unique = true,nullable = false)
    @NotNull
    private String personUUID;
    @Column(name = "isim")
    private String name;
    private String surname;
    private Integer height;
    private Integer weight;
    @Enumerated(EnumType.STRING)
    private EStatus pStatus;

    @PrePersist
    public void beforeInsert(){
        personUUID = UUID.randomUUID().toString();
        pStatus = EStatus.ACTIVE;
    }
}
