package vjezbe_LinkedList;


public class PersonEntry {

	public static void main(String[] args) {

		String name;
//		PersonNode firstPerson = null;
//      PersonNode lastPerson = null;
		PersonDynamicArrayList list = new PersonDynamicArrayList();

		System.out.println("Enter new name: ");
		do {
			name = TextIO.getlnString();
			if (name.equals("kraj"))
				break;
			Person person = new Person(name);
			
			list.add(person);
			
//			PersonNode pNode = new PersonNode(person);
//
//			// First iteration we have only one element.
//			if (firstPerson == null) {
//				firstPerson = pNode;
//				// lastPerson = pNode; <---- we do not need lastPerson any more
//			} else {
//				add(person, firstPerson);
//			}

		} while (true); // You can also write ---> !name.equals("kraj") <---
						// instead of true

//		getSize(firstPerson);
		list.count();
		
//		print(firstPerson);
		list.print();
		
		Person[] myPerson = list.toArray();

	}

	// end of main class

	/**
	 * Adds Persons to NodePerson to PersonNode object
	 * 
	 * @param person
	 *            - new Person that we add.
	 * @param firstPerson
	 *            - first Person that we added.
	 */
	private static void add(Person person, PersonNode firstPerson) {
		PersonNode lastPerson = firstPerson;
		while (lastPerson.getNext() != null) {
			lastPerson = lastPerson.getNext();
		}
		lastPerson.setNext(new PersonNode(person));
	}

	/**
	 * Method that count how many Person we add.
	 * 
	 * @param firstPerson
	 *            - first Person that we added.
	 * @return - numbers of person that are added.
	 */
	public static int getSize(PersonNode firstPerson) {
		int counter = 0;
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			counter++;
		}
		System.out.println("Counter: " + counter);
		return counter;
	}

	/**
	 * Method that prints linked list of PersonNode
	 * 
	 * @param firstPerson
	 *            - first person in PersonNode
	 */
	public static void print(PersonNode firstPerson) {
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			System.out.println(current.getPerson().getName());
		}
	}

	public Person[] toArray(PersonNode firstPerson) {
		Person[] persons = new Person[getSize(firstPerson)];
		int counter = 0;
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			persons[counter] = current.getPerson();
			counter++;
		}
		return persons;
	}

	// end of class
}
