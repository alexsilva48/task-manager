
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import cronapi.CronapiByteHeaderSignature;


/**
* Classe que representa a tabela CATEGORY
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CATEGORY\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.category")
public class category implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "category_id", nullable = false, insertable=true, updatable=true)
        private java.lang.String category_id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Column(name = "icon", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] icon;


    /**
    * @generated
    */
    @Column(name = "color", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String color;


    /**
    * Construtor
    * @generated
    */
    public category(){
    }

    /**
    * Obtém category_id
    * return category_id
    * @generated
    */
    public java.lang.String getCategory_id() {
        return this.category_id;
    }

    /**
    * Define category_id
    * @param category_id category_id
    * @generated
    */
    public category setCategory_id(java.lang.String category_id) {
        this.category_id = category_id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public category setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém icon
    * return icon
    * @generated
    */
    public byte[] getIcon() {
        return this.icon;
    }

    /**
    * Define icon
    * @param icon icon
    * @generated
    */
    public category setIcon(byte[] icon) {
        this.icon = icon;
        return this;
    }
    /**
    * Obtém color
    * return color
    * @generated
    */
    public java.lang.String getColor() {
        return this.color;
    }

    /**
    * Define color
    * @param color color
    * @generated
    */
    public category setColor(java.lang.String color) {
        this.color = color;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
category object = (category)obj;
        if (category_id != null ? !category_id.equals(object.category_id) : object.category_id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((category_id == null) ? 0 : category_id.hashCode());
        return result;
    }

}