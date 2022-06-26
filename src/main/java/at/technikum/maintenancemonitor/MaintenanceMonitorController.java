package at.technikum.maintenancemonitor;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class MaintenanceMonitorController {
    MaintenanceMonitor mm = new MaintenanceMonitor();

    @GetMapping("/api/maintenanceMode")
    public String getMessage()
    {
        return mm.getMessage();
    }

    @PostMapping("/api/maintenanceMode")
    public String updateMessage(@RequestParam(required = false, defaultValue = "") String message)
    {
        if(message.isEmpty() || message.isBlank())
        {
            mm.resetMessage();
            return mm.getMessage();
        }

        mm.setMessage(message);
        return mm.getMessage();
    }
}
