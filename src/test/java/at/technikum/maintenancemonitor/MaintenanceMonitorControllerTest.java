package at.technikum.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {

    @Test
    void MaintenanceMonitorController_GetMessage_Minus_Test()
    {
        // Arrange
        String expected = "-";

        MaintenanceMonitorController maintenanceMonitorController = new MaintenanceMonitorController();

        // Act

        String message = maintenanceMonitorController.getMessage();

        // Assert
        assertEquals(expected,message);
    }

    @Test
    void MaintenanceMonitorController_UpdateMessage_Test()
    {
        // Arrange
        String expected = "This is a test.";

        MaintenanceMonitorController maintenanceMonitorController = new MaintenanceMonitorController();

        // Act

        maintenanceMonitorController.updateMessage("This is a test.");
        String message = maintenanceMonitorController.getMessage();

        // Assert
        assertEquals(expected,message);
    }
}