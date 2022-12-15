package at.fhtw.maintenancemonitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test_maintenanceMonitorPrintMessage(){
		MaintenanceMonitorController monitor = new MaintenanceMonitorController();
		Assertions.assertEquals("Everything works as expected", monitor.printMessage());
	}
	@Test
	public void test_maintenanceMonitorResetMessage(){
		MaintenanceMonitorController monitor = new MaintenanceMonitorController();
		Assertions.assertEquals("ok", monitor.resetMessage());
	}

	@Test
	public void test_maintenanceMonitorSetMessage(){
		MaintenanceMonitorController monitor = new MaintenanceMonitorController();
		Assertions.assertEquals("ok", monitor.printMessage());
	}

	@Test
	public void test_maintenanceMonitorSetMessagePrintMessage(){
		MaintenanceMonitorController monitor = new MaintenanceMonitorController();
		monitor.setMessage("Service checks: No power until 5:00 pm");
		Assertions.assertEquals("Service checks: No power until 5:00 pm", monitor.printMessage());
	}


}
