package com.learning.courses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Paper {

    @Id
    private Long id;

    private String authors;

    private String ISBN;

    private String topic;


}
