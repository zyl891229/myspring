package com.mrlong.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

	public Person selectPersonById(int id) {
		Person p = new Person();
		p.setId(id);
		p.setName("Person name");
		return p;
	}
}
