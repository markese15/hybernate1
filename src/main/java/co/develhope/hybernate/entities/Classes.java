package co.develhope.hybernate.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Table
@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idClass;
    @NotNull
    private String title;
    @NotNull
    private String description;


}
