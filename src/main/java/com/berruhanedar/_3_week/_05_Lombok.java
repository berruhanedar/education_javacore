package com.berruhanedar._3_week;

import lombok.*;

import java.util.Date;

@NoArgsConstructor // Constructor without parameters
@AllArgsConstructor // Constructor with parameters
@Getter
@Setter
@ToString
@Builder

public class _05_Lombok {
    //Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    public static void main(String[] args) {
        _05_Lombok lombok = _05_Lombok.builder()
                .id(1L)
                .name("Berru")
                .surname("Hanedar")
                .createdDate(new Date(System.currentTimeMillis()))
                .build();

        System.out.println(lombok);
    }
}
