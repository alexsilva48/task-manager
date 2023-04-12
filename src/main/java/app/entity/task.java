
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela TASK
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"TASK\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.task")
public class task implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "title", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String title;


    /**
    * @generated
    */
    @Column(name = "descriiption", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descriiption;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "due_date", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date due_date;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @Column(name = "completed_at", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date completed_at;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @Column(name = "apdate_at", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date apdate_at;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user_id;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_category", nullable = true, referencedColumnName = "category_id", insertable=true, updatable=true)
        
        private category category_id;


    /**
    * Construtor
    * @generated
    */
    public task(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public task setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém title
    * return title
    * @generated
    */
    public java.lang.String getTitle() {
        return this.title;
    }

    /**
    * Define title
    * @param title title
    * @generated
    */
    public task setTitle(java.lang.String title) {
        this.title = title;
        return this;
    }
    /**
    * Obtém descriiption
    * return descriiption
    * @generated
    */
    public java.lang.String getDescriiption() {
        return this.descriiption;
    }

    /**
    * Define descriiption
    * @param descriiption descriiption
    * @generated
    */
    public task setDescriiption(java.lang.String descriiption) {
        this.descriiption = descriiption;
        return this;
    }
    /**
    * Obtém due_date
    * return due_date
    * @generated
    */
    public java.util.Date getDue_date() {
        return this.due_date;
    }

    /**
    * Define due_date
    * @param due_date due_date
    * @generated
    */
    public task setDue_date(java.util.Date due_date) {
        this.due_date = due_date;
        return this;
    }
    /**
    * Obtém completed_at
    * return completed_at
    * @generated
    */
    public java.util.Date getCompleted_at() {
        return this.completed_at;
    }

    /**
    * Define completed_at
    * @param completed_at completed_at
    * @generated
    */
    public task setCompleted_at(java.util.Date completed_at) {
        this.completed_at = completed_at;
        return this;
    }
    /**
    * Obtém apdate_at
    * return apdate_at
    * @generated
    */
    public java.util.Date getApdate_at() {
        return this.apdate_at;
    }

    /**
    * Define apdate_at
    * @param apdate_at apdate_at
    * @generated
    */
    public task setApdate_at(java.util.Date apdate_at) {
        this.apdate_at = apdate_at;
        return this;
    }
    /**
    * Obtém user_id
    * return user_id
    * @generated
    */
    public User getUser_id() {
        return this.user_id;
    }

    /**
    * Define user_id
    * @param user_id user_id
    * @generated
    */
    public task setUser_id(User user_id) {
        this.user_id = user_id;
        return this;
    }
    /**
    * Obtém category_id
    * return category_id
    * @generated
    */
    public category getCategory_id() {
        return this.category_id;
    }

    /**
    * Define category_id
    * @param category_id category_id
    * @generated
    */
    public task setCategory_id(category category_id) {
        this.category_id = category_id;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
task object = (task)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}