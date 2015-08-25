package com.workout.service;

        import java.util.List;

        import com.workout.web.dao.WorkoutDao;
        import com.workout.web.domain.Session;
        import org.apache.commons.logging.Log;
        import org.apache.commons.logging.LogFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Propagation;
        import org.springframework.transaction.annotation.Transactional;

@Service("eventService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class WorkoutServiceImpl implements WorkoutService {

    private final Log log = LogFactory.getLog ( WorkoutServiceImpl.class );

    @Autowired
    private WorkoutDao workoutDao;

    public WorkoutServiceImpl() {}

    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void addSession(Session session) {
        if ( log.isDebugEnabled() )
            log.debug(session.toString());

        workoutDao.saveSession(session);
    }

    public List<Session> getAllSessions() {
        return workoutDao.getAllSessions();
    }

}


