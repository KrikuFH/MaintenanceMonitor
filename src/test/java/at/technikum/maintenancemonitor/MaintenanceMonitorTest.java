package at.technikum.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {
    @Test
    void MaintenanceMonitor_GetMessage_Minus_Test()
    {
        // Arrange
        String expected = "-";

        MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

        // Act

        String message = maintenanceMonitor.getMessage();

        // Assert
        assertEquals(expected,message);
    }

    @Test
    void MaintenanceMonitorController_SetMessage_Test()
    {
        // Arrange
        String expected = "This is a test.";

        MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

        // Act

        maintenanceMonitor.setMessage("This is a test.");
        String message = maintenanceMonitor.getMessage();

        // Assert
        assertEquals(expected,message);
    }

    @Test
    void MaintenanceMonitorController_BlankMessage_Test()
    {
        // Arrange
        String expected = "-";

        MaintenanceMonitor maintenanceMonitor = new MaintenanceMonitor();

        // Act

        maintenanceMonitor.setMessage("");
        String message = maintenanceMonitor.getMessage();

        // Assert
        assertEquals(expected,message);
    }
}