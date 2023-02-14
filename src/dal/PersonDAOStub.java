package dal;

import java.util.ArrayList;
import java.util.Hashtable;

import to.PersonTO;

public class PersonDAOStub implements IDAL{

	private Hashtable<Integer, PersonTO> table;
	
	public PersonDAOStub() {
		table = new  Hashtable<Integer, PersonTO>();
		table.put(1,new PersonTO(1, "talha",-1,-1));
		table.put(2,new PersonTO(2, "ali",-1,-1));
		table.put(3,new PersonTO(3, "usman",1,2));
		table.put(4,new PersonTO(4, "ahmed",1,2));
		table.put(5,new PersonTO(5, "usama",-1,2));
		table.put(6,new PersonTO(6, "usama",1,-1));

	}
	
	@Override
	public PersonTO getPerson(int cnic) {
		// TODO Auto-generated method stub
		return table.get(cnic);
	}

	@Override
	public ArrayList<PersonTO> getMatchinPersons(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
