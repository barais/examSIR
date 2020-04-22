/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.istic.taa.jaxrs.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import fr.istic.taa.jaxrs.dao.PersonDAO;
import fr.istic.taa.jaxrs.dao.TodoListItemDAO;
import fr.istic.taa.jaxrs.domain.Person;
import fr.istic.taa.jaxrs.domain.TODOListItem;

@Path("/todos")
public class TodoListItemRestEndpoint {

    private static final Logger logger = Logger.getLogger(TodoListItemRestEndpoint.class.getName());    
    
    TodoListItemDAO tododao;
    PersonDAO pdao;
    
    public TodoListItemRestEndpoint() {
    	tododao = new TodoListItemDAO();
    	pdao = new PersonDAO();
	}

    @GET
    @Path("/test")
    public String helloWorld() {

        return "hello";
    }

    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
    	Person p = new Person();
    	p.setName("test");
        return p;
    }

    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TODOListItem> getTodoByDate(@PathParam("id") long p, @QueryParam("d1") String d1, @QueryParam("d2") String d2) {
    	Person p1 = pdao.findOne(p);
    	Date date1 = null;
    	Date date2 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1);
	    	date2=new SimpleDateFormat("dd/MM/yyyy").parse(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return this.tododao.getAllTaskByDate(p1, date1, date2);
    	
    }
    

}

