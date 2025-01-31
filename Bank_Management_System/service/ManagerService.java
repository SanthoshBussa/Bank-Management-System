package com.jsp.Bank_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Bank_Management_System.dao.ManagerDao;
import com.jsp.Bank_Management_System.dto.Manager;

@Service
public class ManagerService {

	@Autowired
	ManagerDao managerDao;

	public Manager saveManager(Manager manager) {
		return managerDao.saveManager(manager);
	}

	public Manager fetchManagerById(int id) {
		return managerDao.fetchManagerById(id);
	}

	public List<Manager> fetchAllManagers() {
		return managerDao.fetchAllManagers();
	}

	public Manager updateManager(Manager manager) {
		return managerDao.updateManager(manager);
	}

	public void deleteManagerById(int id) {
		managerDao.deleteManagerById(id);
	}

	public void deleteAllManagers() {
		managerDao.deleteAllManagers();
	}
}