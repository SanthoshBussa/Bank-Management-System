package com.jsp.Bank_Management_System.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.Bank_Management_System.dao.FdDao;
import com.jsp.Bank_Management_System.dto.Fd;

@Service
public class FdService {

	@Autowired
	FdDao fdDao;

	public Fd saveFd(Fd fd) {
		return fdDao.saveFd(fd);
	}

	public Fd fetchFdById(int id) {
		return fdDao.fetchFdById(id);
	}

	public List<Fd> fetchAllFds() {
		return fdDao.fetchAllFds();
	}

	public Fd updateFd(Fd fd) {
		return fdDao.updateFd(fd);
	}

	public void deleteFdById(int id) {
		fdDao.deleteFdById(id);
	}

	public void deleteAllFds() {
		fdDao.deleteAllFds();
	}
}