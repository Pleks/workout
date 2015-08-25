package com.workout.web.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Session")
public class Session {
    @Id
    @GeneratedValue
    @Column(name = "session_id")
    private int sessionId;

    @Column(name = "date")
    private Date date;

    @Column(name = "duration")
    private int duration;

    @Column(name = "max_heart_rate")
    private Integer maxHeartRate;

    @Column(name = "average_heart_rate")
    private Integer averageHeartRate;

    @Column(name = "activity_id")
    private int activityId;

    public Session() {}

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Integer getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(Integer maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public Integer getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(Integer averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }
}
