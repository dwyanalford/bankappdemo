package com.revature.service;

import com.revature.dao.BankAccountsDao;
import com.revature.model.BankAccount;

import java.sql.SQLException;
import java.util.List;

public class BankAccountService {

    private BankAccountsDao bankAccountDao = new BankAccountsDao();

    public List<BankAccount> getAllBankAccountsBelongingToUser(int userId) throws SQLException {
        return bankAccountDao.getAllBankAccountsBelongingToUser(userId);
    }

}