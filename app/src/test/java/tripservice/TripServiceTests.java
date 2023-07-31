package tripservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TripServiceTests {
    @Test
    void getTripsByUser_Guest_ThrowsException() {
        var tom = new User();
        var tripService = new TripService();

        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(tom));
    }
}
