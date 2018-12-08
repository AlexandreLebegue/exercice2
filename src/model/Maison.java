package model;

import java.util.ArrayList;
import java.util.Observable;

public class Maison extends Observable{
	private ArrayList<Person> members;
	private String name;
	
	public Maison(ArrayList<Person> member, String name) {
		this.members = member;
		this.name = name;
	}
	
	public void addGuest(Person person) {
		members.add(person);
		setChanged();
		notifyObservers(person);	
	}
	
	public ArrayList<Person> getMember() {
		return members;
	}
	
	public void setMember(ArrayList<Person> member) {
		this.members = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
