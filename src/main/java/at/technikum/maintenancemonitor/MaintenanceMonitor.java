package at.technikum.maintenancemonitor;

public class MaintenanceMonitor {
    private String message = "-";

    public MaintenanceMonitor(){
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        if(message.isBlank() || message.isEmpty())
        {
            this.message = "-";
        }
        else
        {
            this.message = message;
        }
    }
}
