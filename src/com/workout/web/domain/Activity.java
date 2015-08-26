package com.workout.web.domain;

/**
 * Created by aleksander.nybakk on 21.08.2015.
 */
public class Activity {
    private int activityId;
    private String name;
    private int caloriesMinute;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesMinute() {
        return caloriesMinute;
    }

    public void setCaloriesMinute(int caloriesMinute) {
        this.caloriesMinute = caloriesMinute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (activityId != activity.activityId) return false;
        if (caloriesMinute != activity.caloriesMinute) return false;
        if (name != null ? !name.equals(activity.name) : activity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = activityId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + caloriesMinute;
        return result;
    }
}
