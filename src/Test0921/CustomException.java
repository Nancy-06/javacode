package Test0921;

public class CustomException extends Exception{
    public CustomException(){

    }
    public CustomException(String message){
        super(message);
    }
    public CustomException(String message,Throwable cause){
        super(message,cause);
    }
    public CustomException(Throwable cause){
        super(cause);
    }
    public CustomException(String message,Throwable cause,boolean enableSuppresssion,boolean writableStackTrace){
        super(message,cause,enableSuppresssion,writableStackTrace);
    }
}
