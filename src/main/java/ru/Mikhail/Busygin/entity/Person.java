package ru.Mikhail.Busygin.entity;

import lombok.Data;
import java.sql.Date;

@Data
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String placeOfBirth;
}
