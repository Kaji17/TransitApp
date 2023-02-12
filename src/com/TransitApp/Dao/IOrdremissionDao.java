package com.TransitApp.Dao;

import java.util.List;

import com.TransitApp.Modeles.Ordremission;

public interface IOrdremissionDao {
	
	void saveOrdremission(Ordremission ordremission);

	void updateOrdremission(Ordremission ordremission);

	Ordremission getOrdremissionById(int id);

	

	void deleteOrdremission(int id);

	List<Ordremission> getAllOrdremission();

	List<Ordremission> rechercher(String nom);
}
