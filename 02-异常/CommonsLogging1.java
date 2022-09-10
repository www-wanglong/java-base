import com.sun.tools.javac.Main;

public class CommonsLogging1 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        log.info("start...");
        log.warn("end.");
    }
}