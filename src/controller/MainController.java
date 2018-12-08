package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import model.Maison;
import model.Person;
import view.MaisonView;

public class MainController {
	
	public static void main(String[] args)
	{
		Person michel = new Person("Michel");
		Person joseph = new Person("Joseph");
		Person christine = new Person("Christine");
		Person pierre = new Person("Pierre");
		Person jean = new Person("Jean");
		Person harry = new Person("harry");
		Person rick = new Person("rick");
		Person pascal = new Person("pascal");
		Person robin = new Person("robin");
		Person yannick = new Person("yannick");
		
		ArrayList<Person> family = new ArrayList<Person>();
		Collections.addAll(family, michel,joseph,christine);
		Maison maison = new Maison(family,  "Maison family 1");
		
		ArrayList<Person> family2 = new ArrayList<Person>();
		Collections.addAll(family2, rick,pascal,yannick);
		Maison maison2 = new Maison(family,  "Maison family 2");
		
		MaisonView maisonView = new MaisonView();
		maisonView.initObserver(maison);
		maisonView.initObserver(maison2);

		
		maison.addGuest(jean);
		maison2.addGuest(christine);
		maison.addGuest(pierre);
		maison2.addGuest(harry);
		maison2.addGuest(robin);

		
	}
}
