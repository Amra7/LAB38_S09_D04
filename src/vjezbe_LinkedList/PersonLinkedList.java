package vjezbe_LinkedList;

public class PersonLinkedList implements PersonList {
	
	private PersonNode firstPerson;
	
	

	public PersonNode getFirstPerson() {
		return firstPerson;
	}

	/* (non-Javadoc)
	 * @see vjezbe_LinkedList.PersonList#add(vjezbe_LinkedList.Person)
	 */
	@Override
	public void add(Person person) {	
		
		PersonNode next = new PersonNode(person);
		
		if(firstPerson == null){
			firstPerson = next;
		} else {
			PersonNode lastPerson = firstPerson;
			
			while (lastPerson.getNext() != null) {
				lastPerson = lastPerson.getNext();
			}
			lastPerson.setNext(new PersonNode(person));
		}
		
		
	}

	/* (non-Javadoc)
	 * @see vjezbe_LinkedList.PersonList#count()
	 */
	@Override
	public int count() {
		int counter = 0;
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			counter++;
		}
		System.out.println("Counter: " + counter);
		return counter;
	}

	/* (non-Javadoc)
	 * @see vjezbe_LinkedList.PersonList#print()
	 */
	@Override
	public void print() {
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			System.out.println(current.getPerson().getName());
		}
	}

	
	/* (non-Javadoc)
	 * @see vjezbe_LinkedList.PersonList#toArray()
	 */
	@Override
	public Person[] toArray() {
		Person[] persons = new Person[count()];
		int counter = 0;
		for (PersonNode current = firstPerson; current != null; current = current
				.getNext()) {
			persons[counter] = current.getPerson();
			counter++;
		}
		return persons;
	}
}
