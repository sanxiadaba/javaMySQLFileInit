package com.zjj.dao;

import com.zjj.sqlConfig.MySQLFileInit;

public class BaseDao {
    public static void main(String[] args) {
        // 完成数据库初始化
        MySQLFileInit.run();
    }
}
