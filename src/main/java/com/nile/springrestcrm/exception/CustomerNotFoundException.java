package com.nile.springrestcrm.exception;

public class CustomerNotFoundException extends  RuntimeException{

    public CustomerNotFoundException(String message , Throwable throwable){
        super(message ,throwable );
    }
    public CustomerNotFoundException(Throwable throwable){
        super(throwable );
    }
    public CustomerNotFoundException(String message ){
        super(message);
    }
}
