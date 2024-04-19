package service;

import java.util.List;

import entities.AccountPayable;
import persistence.IEntitiesService;

public class AccountPayableService implements IEntitiesService<AccountPayable>{

	@Override
	public void findAll(List<AccountPayable> accountPayables) {
		accountPayables.forEach(ap -> {
			System.out.println(" ".repeat(10) + "Id : " + ap.getIdPayable()+" "
					+ap.getNamePayable().toUpperCase()+ " -> "
					+ap.getUserAccount().getUser_firstname()+ " "
					+ap.getUserAccount().getUser_lastname()
					);
		});	
	}

	@Override
	public AccountPayable findById(int idAccountPayable, List<AccountPayable> accountPayables) {
		for(AccountPayable accountPayable: accountPayables) {
			if(accountPayable.getIdPayable()==idAccountPayable) {
				return accountPayable;
			}
		}
		return null;
	}

	@Override
	public List<AccountPayable> edit(int id, AccountPayable o, List<AccountPayable> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountPayable> save(AccountPayable accountPayable, List<AccountPayable> accountPayables) {
		int id = accountPayables.size();
		id++;
		accountPayable.setIdPayable(id);
		accountPayables.add(accountPayable);
		return accountPayables;
	}

	@Override
	public List<AccountPayable> delete(int id, List<AccountPayable> accountPayables) {
		int idEliminar = 0;
		for(int i=0; i<accountPayables.size(); i++) {
			if(accountPayables.get(i).getIdPayable() == id) {
				idEliminar = i;
				break;
			}
		}
		accountPayables.remove(idEliminar);
		return accountPayables;
	}

}
