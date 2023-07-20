package Demo1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.*;


public class myTimerLoggings {
private static Logger lg=LogManager.getLogger(myTimerLoggings.class.getName());	
static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
public static void main(String[] args) {
		debug();
		info();
		error();
		}
public static void debug() {
		LocalTime lt = LocalTime.of(20, 27,0);
		for(int i = 0; i<3; i++) {
			lg.debug(lt.format(formatter));
			lt=lt.plusSeconds(1); 	
		}
	}
public static void info() {
	LocalTime lt = LocalTime.of(20, 28,0);
	for(int i = 0; i<3; i++) {
		lg.info(lt.format(formatter));
		lt=lt.plusMinutes(1);
	}
	}
public static void error() {	
	LocalTime lt = LocalTime.of(21, 0,0);
	for(int i = 0; i<3; i++) {
		lg.error(lt.format(formatter));
		lt=lt.plusHours(1);
	}
	}
	
}