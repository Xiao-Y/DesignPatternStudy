package com.xiaoy.github.command;

import com.xiaoy.github.command.sqlCrud.SqlCrudCreateCommand;
import com.xiaoy.github.command.sqlCrud.SqlCrudDeleteCommand;
import com.xiaoy.github.command.sqlCrud.SqlCrudQueryCommand;
import com.xiaoy.github.command.sqlCrud.SqlCrudUpdateCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyongtao
 * @since 2021-3-8 9:01
 */
public class Main {

    final static String CREATE = "CREATE";
    final static String UPDATE = "UPDATE";
    final static String DELETE = "DELETE";
    final static String QUERY = "QUERY";

    public static void main(String[] args) {

        // 添加数据
        Map<String,Command> map = new HashMap<>();
        map.put(CREATE,new SqlCrudCreateCommand(new SqlCrud()));
        map.put(UPDATE,new SqlCrudUpdateCommand(new SqlCrud()));
        map.put(DELETE,new SqlCrudDeleteCommand(new SqlCrud()));
        map.put(QUERY,new SqlCrudQueryCommand(new SqlCrud()));

        // 执行
        map.get(CREATE).execute();
        map.get(UPDATE).execute();
        map.get(DELETE).execute();
        map.get(QUERY).execute();
    }
}
