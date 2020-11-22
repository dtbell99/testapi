package com.dtbell99.testapi.model;

import java.util.List;

public class LogResponse {
    private boolean success;
    private List<LogEntry> logList;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<LogEntry> getLogList() {
        return logList;
    }

    public void setLogList(List<LogEntry> logList) {
        this.logList = logList;
    }
}
