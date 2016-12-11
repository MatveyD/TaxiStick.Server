package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.taxi;

import java.util.List;

public interface ReminderService {

    List<taxi> getAll();
    taxi getByID(long id);
    taxi save(taxi taxi);
    void remove(long id);


    //List<favorites> getAll();

}
