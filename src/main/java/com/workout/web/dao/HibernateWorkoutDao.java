package com.workout.web.dao;

import com.workout.web.domain.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("workoutDao")
public class HibernateWorkoutDao implements WorkoutDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveSession(Session session) {
        sessionFactory.getCurrentSession().saveOrUpdate(session);
    }

    public Session getSessionById(Integer id) {
        return (Session) sessionFactory.getCurrentSession().load(Session.class, id);
    }

    public List<Session> getSessionsForDay(Date day) {

        return null;
    }

    @SuppressWarnings("unchecked")
    public List<Session> getAllSessions() {
        return (List<Session>) sessionFactory.getCurrentSession().createCriteria(Session.class).list();
    }
}
