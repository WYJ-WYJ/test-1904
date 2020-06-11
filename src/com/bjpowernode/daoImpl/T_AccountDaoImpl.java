package com.bjpowernode.daoImpl;

import com.bjpowernode.dao.T_AccountDao;

public class T_AccountDaoImpl implements T_AccountDao {
    @Override
    public int checkAccount(String account) throws Exception {
        String sql="select count(*) from t_account where account=''";
        return 0;
    }

    @Override
    public int getBalance(String account) throws Exception {
        return 0;
    }

    @Override
    public int updateBalance(String account, int balance) throws Exception {
        return 0;
    }
}
