package predavanje_ArrayList_Bank;

import java.util.ArrayList;

public class Bank {

	private Indentification id;
	ArrayList<Client> client;
	ArrayList<Branch> branch;
	
	/**
	 * 
	 * @param id
	 * @param client
	 * @param branch
	 */
	public Bank(Indentification id, ArrayList<Client> client,
			ArrayList<Branch> branch) {
		super();
		this.id = id;
		this.client = client;
		this.branch = branch;
	}
	
	
}
