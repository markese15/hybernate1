package co.develhope.hybernate.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Table
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private   String id;
    @NotNull
   private String name;
    @NotNull
  private   String surname;
    @Column(unique = true)
   private String email;
}
