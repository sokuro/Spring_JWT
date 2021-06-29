package com.spring.jwt.auth0.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/28/2021
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String empNo;
    private String empName;
    private String position;
}
