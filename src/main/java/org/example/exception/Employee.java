package org.example.exception;

import lombok.*;

@Getter
@Setter
@ToString
@Data
@Builder
@AllArgsConstructor
public class Employee {
    private String id;
    private Integer salary;
    private String name;
    private String grade;
}
