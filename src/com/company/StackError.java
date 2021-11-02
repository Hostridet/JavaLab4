package com.company;


class StackError extends Exception
{
    public StackError() {
        super();
    }


    public StackError(String error)
    {
        super(error);
    }
}
