package vjezbe_LinkedList;

public interface PersonList {

	/**
	 * Adds Persons to NodePerson to PersonNode object
	 * 
	 * @param person
	 *            - new Person that we add.
	 */
	public abstract void add(Person person);

	/**
	 * Method that count how many Person we add.
	 * 
	 * @param firstPerson
	 *            - first Person that we added.
	 * @return - numbers of person that are added.
	 */
	public abstract int count();

	/**
	 * Method that prints linked list of PersonNode
	 */
	public abstract void print();

	/**
	 * Method that makes Linked List of person to Array
	 * @return array of Linked List of Persons
	 */
	public abstract Person[] toArray();

}