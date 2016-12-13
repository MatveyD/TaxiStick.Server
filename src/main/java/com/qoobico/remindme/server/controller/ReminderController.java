package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.entity.taxi;
import com.qoobico.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/taxi", method = RequestMethod.GET)
    @ResponseBody
    public List<taxi> getAllTaxi() {
        return service.getAll();
    }

    @RequestMapping(value = "/cheap", method = RequestMethod.GET)
    @ResponseBody
    public List<taxi> getCheapTaxi() {
        return service.getCheap();
    }


    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public taxi getReminder(@PathVariable("id") long remindID) {
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public taxi saveRemider(@RequestBody taxi taxi) {
        return service.save(taxi);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }

}
