package hn.edu.ujcv.objetos;

public class Logger {
    private static Logger log;

    private Logger(){
    }
    public static Logger getInstance(){ //SINGLETON
        if (log == null) {
            log = new Logger();
        }
        return log;
    }
    public void log(String msg){
        System.out.println(msg);
    }
}
