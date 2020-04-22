package fr.istic.taa.jaxrs.domain;


@javax.persistence.Entity

public class TODOListItem implements java.io.Serializable
{  
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    private java.lang.Integer id;
    
    private java.lang.String libelle;
    
    private java.util.Date dueDate;
    
    private boolean done;
    
    private java.util.Date dateCreation;
    
    private java.lang.Double duration;
    
    private java.lang.String location;
    
    private java.lang.String url;
    

    
    @javax.persistence.ManyToMany(
        
    )
    java.util.Collection<Person> person;
    @javax.persistence.ManyToMany(
        
    )
    java.util.Collection<Tag> tag;
    @javax.persistence.ManyToOne(
        
    )
    TODOList todolist;
    @javax.persistence.OneToOne(
        
    )
    Note note;

    
    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    
    
    public java.lang.Integer getId() {
        return this.id;
    }
    
    public void setLibelle(java.lang.String libelle) {
        this.libelle = libelle;
    }
    
    
    public java.lang.String getLibelle() {
        return this.libelle;
    }
    
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }
    
    
    public java.util.Date getDueDate() {
        return this.dueDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    

    public boolean isDone() {
        return this.done;
    }
    
    public void setDateCreation(java.util.Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
    public java.util.Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDuration(java.lang.Double duration) {
        this.duration = duration;
    }
    
    
    public java.lang.Double getDuration() {
        return this.duration;
    }
    
    public void setLocation(java.lang.String location) {
        this.location = location;
    }
    
    
    public java.lang.String getLocation() {
        return this.location;
    }
    
    public void setUrl(java.lang.String url) {
        this.url = url;
    }
    
    
    public java.lang.String getUrl() {
        return this.url;
    }
    

    
    public void setPerson(java.util.Collection<Person> person) {
        this.person = person;
    }
    
    
    public java.util.Collection<Person> getPerson() {
        return this.person;
    }
    
    public void setTag(java.util.Collection<Tag> tag) {
        this.tag = tag;
    }
    
    
    public java.util.Collection<Tag> getTag() {
        return this.tag;
    }
    
    public void setTodolist(TODOList todolist) {
        this.todolist = todolist;
    }
    
    
    public TODOList getTodolist() {
        return this.todolist;
    }
    
    public void setNote(Note note) {
        this.note = note;
    }
    
    
    public Note getNote() {
        return this.note;
    }
    
}

