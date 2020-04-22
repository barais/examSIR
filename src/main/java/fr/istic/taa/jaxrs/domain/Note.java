package fr.istic.taa.jaxrs.domain;


@javax.persistence.Entity
@javax.annotation.Generated("com.genmymodel.jpa")
public class Note implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    private java.lang.Integer id;
    
    private java.lang.String description;
    

    

    @javax.annotation.Generated("genmymodel.jpa.generator")
    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    
    @javax.annotation.Generated("com.genmymodel.jpa")
    public java.lang.Integer getId() {
        return this.id;
    }
    @javax.annotation.Generated("genmymodel.jpa.generator")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
    
    @javax.annotation.Generated("com.genmymodel.jpa")
    public java.lang.String getDescription() {
        return this.description;
    }
    

    
}

