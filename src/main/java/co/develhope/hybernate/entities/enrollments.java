package co.develhope.hybernate.entities;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idEnr;
    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="id",nullable = false)
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id",nullable = false,insertable = false,updatable = false)
    private Classes classes;
}
