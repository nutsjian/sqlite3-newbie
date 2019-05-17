package me.nutsjian.sqlite3.springmvc.sqlite3;

public class SQLite3LoadException extends Exception {
    private static final long serialVersionUID = 1L;

    public SQLite3LoadException(String _msg)
    {
        super(_msg);
    }

    public SQLite3LoadException(Exception _e)
    {
        super(_e);
    }
}
