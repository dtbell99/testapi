package com.dtbell99.testapi.controllers;

import com.dtbell99.testapi.model.LogEntry;
import com.dtbell99.testapi.model.LogResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Log {

    private List<LogEntry> allLogs = new ArrayList<>();

    @PostMapping(path = "/log", consumes = "application/json", produces = "application/json")
    public LogResponse postLog(@RequestBody LogEntry logEntry) {
        System.out.println("Log Received");
        logEntry.setTimestamp(new Date());
        allLogs.add(logEntry);
        LogResponse logResponse = new LogResponse();
        logResponse.setSuccess(true);
        return logResponse;
    }

    @GetMapping(path = "/log", produces = "application/json")
    public LogResponse getLogs() {
        LogResponse logResponse = new LogResponse();
        logResponse.setSuccess(true);
        logResponse.setLogList(allLogs);
        return logResponse;
    }


}
