package com.syntax.class20;

public class ScrumTeam extends Employee{
	String ceremonies;
	void attendMettings() {
		System.out.println("Scrum team attainds "+ceremonies);
	}

}
class ProductOwner extends ScrumTeam{
	void PrioritizeBacklog(){
		System.out.println("Product owner prioritize the backlog.");
	}
}

