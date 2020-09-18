package com.unicid.dbcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    // Modelo da tabela contact.

    @Id // Designa PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Faz pk auto-incrementar
    private Long id;

    private String name;
    private String email;
    private String phone;
}
