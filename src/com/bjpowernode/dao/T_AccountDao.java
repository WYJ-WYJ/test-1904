package com.bjpowernode.dao;

public interface T_AccountDao {

    //1、检测账户是否存在
    public int checkAccount(String account) throws  Exception;

    //2、读取账户的余额
    public int getBalance(String account) throws Exception;

    //3、更新账户的余额
    public  int updateBalance(String account,int balance) throws Exception;
}
