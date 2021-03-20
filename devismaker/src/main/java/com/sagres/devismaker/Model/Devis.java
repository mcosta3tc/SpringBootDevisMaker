package com.sagres.devismaker.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sagres.devismaker.jsonType.JsonType;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "devis", schema = "public")
@org.hibernate.annotations.TypeDef(name = "JsonType", typeClass = JsonType.class)
public class Devis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data")
    @Type(type = "JsonType")
    private Produit data;

    @Column(name = "client")
    private String client;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Produit getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Produit data) {
        this.data = data;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Devis [id=" + id + ", data=" + data + "]";
    }

}