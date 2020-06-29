package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.entity.Person;
import com.mvc.service.PersonService;

@RequestMapping(value = "/v1")
@Controller
public class PersonController {

		@Autowired
		private PersonService personService;

		
		@RequestMapping(value = "/persons", method = RequestMethod.GET)
		public String loadPage(Model model) {
			model.addAttribute("person", new Person());
			model.addAttribute("listPersons", this.personService.listPersons());

			return "person";
		}
		
		//For add and update person both
		@RequestMapping(value= "/person/add", method = RequestMethod.POST)
		public String addPerson(@ModelAttribute("person") Person p){
			
			if(p.getId() == 0){
				//new person, add it
				personService.addPerson(p);
			}
			
			return "redirect:/v1/persons";
			
		}
		
		
}
