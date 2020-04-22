package fr.istic.taa.jaxrs.domain;


@javax.persistence.Entity

public class Person implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id 
    private long id;
    
    private java.lang.String name;
    
    private java.lang.String prenom;
    
    private java.lang.String login;
    
    private java.lang.String pass;
    

    

    
    public void setId(long id) {
        this.id = id;
    }
    
    
    public long getId() {
        return this.id;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    
    public java.lang.String getName() {
        return this.name;
    }
    
    public void setPrenom(java.lang.String prenom) {
        this.prenom = prenom;
    }
    
    
    public java.lang.String getPrenom() {
        return this.prenom;
    }
    
    public void setLogin(java.lang.String login) {
        this.login = login;
    }
    
    
    public java.lang.String getLogin() {
        return this.login;
    }
    
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }
    
    
    public java.lang.String getPass() {
        return this.pass;
    }
    

    
}

