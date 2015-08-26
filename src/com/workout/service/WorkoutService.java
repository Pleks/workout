package com.workout.service;

import java.util.List;

import com.workout.web.domain.Session;

public interface WorkoutService {

    public void addSession ( Session session );

    public List<Session> getAllSessions();
}
