package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static class TodoTable implements BaseColumns{
        public static final String TABLE_NAME = "ToDoList";
        public static final String _ID = "_id";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_NAME_PRIORITY = "priority";
    }
    public static final String SQL_CREATE_TABLE = "CREATE TABLE "+ TodoTable.TABLE_NAME
            + "(" + TodoTable._ID + " INTEGER PRIMARY KEY, "
            + TodoTable.COLUMN_DATE + " TEXT,"
            + TodoTable.COLUMN_STATE + " INTEGER,"
            + TodoTable.COLUMN_CONTENT + " TEXT,"
            + TodoTable.COLUMN_NAME_PRIORITY +" INTEGER)";

    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS "+ TodoTable.TABLE_NAME;

    private TodoContract() {
    }

}
