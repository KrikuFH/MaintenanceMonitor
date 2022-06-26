package at.technikum.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MaintenanceMonitorController {
    MaintenanceMonitor mm = new MaintenanceMonitor();

    @GetMapping("/api/maintenanceMode")
    public String getMessage()
    {
        return mm.getMessage();
    }
}
