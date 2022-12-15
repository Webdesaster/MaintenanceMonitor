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

    //TODO set
    @GetMapping("/api/message/set")
    public String setMessage(String m) {
        this.m = m;
        return "ok";
    }

    //TODO reset
}
