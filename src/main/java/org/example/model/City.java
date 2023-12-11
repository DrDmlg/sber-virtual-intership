package org.example.model;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private Long id;
    private String name;
    private String region;
    private String district;
    private Integer population;
    private String foundation;
}
