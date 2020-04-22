package fr.istic.taa.jaxrs.domain;


@javax.persistence.Entity

public class TODOList implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    private java.lang.Integer id;
    
    private java.lang.String name;
    

    
    @javax.persistence.OneToMany(
        mappedBy = "todolist"
    )
    java.util.Collection<TODOListItem> todolistitem;

    @javax.persistence.ManyToOne
   Person user;

    

	
    public void setId(java.lang.Integer id) {
        this.id = id;
    }
    
    
    public java.lang.Integer getId() {
        return this.id;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    
    public java.lang.String getName() {
        return this.name;
    }
    

    
    public void setTodolistitem(java.util.Collection<TODOListItem> todolistitem) {
        this.todolistitem = todolistitem;
    }
    
    
    public java.util.Collection<TODOListItem> getTodolistitem() {
        return this.todolistitem;
    }
    
    public Person getUser() {
		return user;
	}

	public void setUser(Person user) {
		this.user = user;
	}

}

