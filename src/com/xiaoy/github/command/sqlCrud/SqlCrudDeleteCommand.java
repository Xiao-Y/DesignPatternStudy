package com.xiaoy.github.command.sqlCrud;

import com.xiaoy.github.command.Command;
import com.xiaoy.github.command.SqlCrud;

/**
 * @author liuyongtao
 * @since 2021-3-8 8:55
 */
public class SqlCrudDeleteCommand implements Command {

    private SqlCrud sqlCrud;

    public SqlCrudDeleteCommand(SqlCrud sqlCrud) {
        this.sqlCrud = sqlCrud;
    }

    @Override
    public void execute() {
        sqlCrud.delete();
    }
}
