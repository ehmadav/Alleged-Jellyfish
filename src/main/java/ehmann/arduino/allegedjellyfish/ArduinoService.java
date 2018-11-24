package ehmann.arduino.allegedjellyfish;

import org.springframework.stereotype.Service;

@Service
public class ArduinoService {
    public String getStatus() {
        // get led status from arduino board or wifi or bt or whatever
        return "okay";
    }
}
