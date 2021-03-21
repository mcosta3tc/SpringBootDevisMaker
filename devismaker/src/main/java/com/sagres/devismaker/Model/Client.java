package com.sagres.devismaker.Model;

import com.sagres.devismaker.jsonType.JsonType;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "clients", schema = "public")
@org.hibernate.annotations.TypeDef(name = "JsonType", typeClass = JsonType.class)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom")
    private String name;

    @Column(name = "code_postal")
    private Integer cp;

    @Column(name = "data")
    @Type(type = "JsonType")
    private Devis data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Devis getData() {
        return data;
    }

    public void setData(Devis data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cp=" + cp +
                ", data=" + data +
                '}';
    }
}
