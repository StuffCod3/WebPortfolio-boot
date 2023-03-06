package ru.stuff.WebPortfolio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "social")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Social {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotEmpty(message = "Укажите название соцсети")
    @Column(name = "name")
    private String name;

//    @NotEmpty(message = "Укажите колличество подписчиков")
    @Column(name = "quantity")
    private String quantity;
    @Column(name = "image")
    private String image;
    @Column(name = "url")
    private String url;
}
