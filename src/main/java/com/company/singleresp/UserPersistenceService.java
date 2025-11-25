package com.company.singleresp;

public class UserPersistenceService {

    private final  Store store = new Store();
    public void save(User user) {
        store.store(user);
    }
	
}
