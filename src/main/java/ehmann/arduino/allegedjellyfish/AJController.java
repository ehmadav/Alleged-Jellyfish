package ehmann.arduino.allegedjellyfish;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AJController {
    private final ArduinoService arduinoService;

    public AJController(ArduinoService arduinoService) {
        this.arduinoService = arduinoService;
    }

    @RequestMapping("/llama")
    public String index(Model model) {
        String[] fruits = new String [] {"kiwi", "banana", "orange"};

        model.addAttribute("fruits", fruits);
        model.addAttribute("arduino", arduinoService.getStatus());
        return "index";
    }
}
