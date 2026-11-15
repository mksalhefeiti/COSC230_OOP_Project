package model;

// QUEUED -> RUNNING or CANCELLED, RUNNING -> COMPLETED or CANCELLED (checked in Job)
public enum JobStatus {
    QUEUED, RUNNING, COMPLETED, CANCELLED
}
