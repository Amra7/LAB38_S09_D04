package vjezbe_LinkedList;

public class PersonDynamicArrayList implements PersonList{

	private Person[] persons;
	private int nextIndex;
	
	public PersonDynamicArrayList() {
		persons = new Person[10];
		nextIndex = 0;
	}
	
	@Override
	public void add(Person person) {
        if (nextIndex <= persons.length) {
        	Person[]temp = new Person[persons.length*2];
               	for(int i=0; i<persons.length; i++){
        		temp[i] = persons[i];
        	}
        	persons = temp;
         }
        persons[nextIndex] = person;
    	nextIndex++; 
		}

	@Override
	public int count() {
		return nextIndex;
	}

	@Override
	public void print() {
	    for( int i = 0; i< nextIndex; i++){
	    	System.out.println(persons[i].getName());
	    }
		
	}

	@Override
	public Person[] toArray() {
		Person [] newPersons = new Person [nextIndex];
		for ( int i =0; i< nextIndex; i++){
			newPersons[i] = persons[i];
		}
		return null;
	}

}
