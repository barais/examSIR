package fr.istic.taa.jaxrs.domain;


@javax.persistence.Entity
@javax.annotation.Generated("com.genmymodel.jpa")
public class Tag implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    private java.lang.String name;
    

    

    @javax.annotation.Generated("genmymodel.jpa.generator")
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    @javax.annotation.Generated("com.genmymodel.jpa")
    public java.lang.String getName() {
        return this.name;
    }
    

    
}

