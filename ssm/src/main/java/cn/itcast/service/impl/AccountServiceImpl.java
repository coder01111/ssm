package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired//注入依赖
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        List<Account> list = accountDao.findAll();
        return list;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");
            accountDao.saveAccount(account);
    }
}
