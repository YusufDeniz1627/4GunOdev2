package Enitites;



import Abstract.IEntity;

public class Customer implements IEntity{
	int Id;
	String FirstName;
	String LastName;
	int DateOfBird;
	String NationalityId;
	public String getLastName;
	//------------------------
	//fýeld
	public Customer(int id, String firstName, String lastName, int dateOfBird, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBird = dateOfBird;
		NationalityId = nationalityId;
	}
	//------------------
	//getter and setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateOfBird() {
		return DateOfBird;
	}
	public void setDateOfBird(int dateOfBird) {
		DateOfBird = dateOfBird;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	} 
}
