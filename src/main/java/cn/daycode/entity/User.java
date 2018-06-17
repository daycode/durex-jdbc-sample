package cn.daycode.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "name_")
    private String name;

    @Column(name = "sex_")
    private Integer sex;
}
