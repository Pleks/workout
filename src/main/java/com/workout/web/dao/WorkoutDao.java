package com.workout.web.dao;

import java.util.Date;
import java.util.List;

import com.workout.web.domain.Session;

public interface WorkoutDao {
    public void saveSession ( Session session );

    public Session getSessionById ( Integer id );

    public List<Session> getSessionsForDay ( Date day );

    public List<Session> getAllSessions();
}
