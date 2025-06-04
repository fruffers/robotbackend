package com.waverover.robotbackend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/robot")
public class RobotController {
    @PostMapping("/send-command")
    public String sendCommand(@RequestBody String cmd)
    {
        System.out.println("Received command: " + cmd);
        return "{\"status\":\"Command received\"}";
    }
}
