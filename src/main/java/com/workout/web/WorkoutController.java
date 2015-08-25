package com.workout.web;

import com.workout.service.WorkoutService;
import com.workout.web.domain.Session;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class WorkoutController {

    private static Logger logger = Logger.getLogger(WorkoutController.class);

    private WorkoutService workoutService;

    @RequestMapping(value = "Workout/sessions", method = RequestMethod.GET)
    public ModelAndView viewEvents() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put ( "events", workoutService.getAllSessions() );

        return new ModelAndView ( "sessionView", model );
    }


    @RequestMapping(value = "Workout/overview", method = RequestMethod.GET)
    public String printWorkout(ModelMap model) {

        logger.debug("overview is executed!");

        model.addAttribute("message", "Hello, now work out!");

        return "overview";
    }

    @RequestMapping(value = "Workout/session", method = RequestMethod.GET)
    public org.springframework.web.servlet.ModelAndView session() {
        return new ModelAndView("session", "command", new Session());
    }

    @RequestMapping(value = "Workout/addSession", method = RequestMethod.POST)
    public String addSession(@ModelAttribute("Workout") Session session,
                             ModelMap model) {
        model.addAttribute("message", "Hello, now work out!");
        return "overview";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }
}
