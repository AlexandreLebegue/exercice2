package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.text.ChangedCharSetException;

import model.Maison;
import model.Person;

public class MaisonView implements Observer {
	
	public MaisonView() {
		System.out.println("Initialisation de la vue Maison...");
	}
	
	public void initObserver(Maison maisonToObserve) {
		 maisonToObserve.addObserver(this); 
		  }
	
	 public void update(Observable observable, Object objectConcerne) {
		 Maison maison = (Maison) observable;
		 Person person = (Person) objectConcerne;
		 System.out.println(maison.getName() + " a un nouvel invité : " + person.getName());
	 }
	
}
