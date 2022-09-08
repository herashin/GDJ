package service;

import domain.ContactDTO;

public interface ContactService {
	
	public void addContact( ContactDTO contact );
	public void modifyContact(ContactDTO contact);
	public void deleteContact(int contact_no);
	public void finContactByNo(int contact_no);
	public void findALLContacts();

}
