package vjezbe_LinkedList;
/**
 * Class that we creates NodePerson
 * @author amrapoprzanovic
 *
 */
public class PersonNode {

	private Person person;
	private PersonNode next;
	
	
	public PersonNode (Person person){
		this.person = person;
		this.next = null;
	}

	/**
	 * Getter for Person
	 * @return person
	 */
	public Person getPerson() {
		return person;
	}

    /**
     * Setter new Person
     * @param person - new Person that we create
     */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Getter for next
	 * @return  - next Person
	 */
	public PersonNode getNext() {
		return next;
	}

	/**
	 * Setter for link next Person
	 * @param next - reference to new Person
	 */
	public void setNext(PersonNode next) {
		this.next = next;
	}
	


	// end of class

}
