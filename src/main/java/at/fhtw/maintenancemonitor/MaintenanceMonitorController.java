package at.fhtw.maintenancemonitor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    public String m = "Everything works as expected";

// show status message http://localhost:8080/api/message
    @GetMapping("/api/message")
    public String printMessage(){
        return m;
    }

    @GetMapping("/api/message/reset")
    public String resetMessage(){
    this.m = "Everything works as expected";
        return "ok";
    }
    @GetMapping("/api/message/set")
    public String setMessage(String m) {
        this.m = m;
        return "ok";
    }


}
