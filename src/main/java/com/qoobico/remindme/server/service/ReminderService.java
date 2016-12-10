package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.remind;

import java.util.List;

public interface ReminderService {

    List<remind> getAll();
    remind getByID(long id);
    remind save(remind remind);
    void remove(long id);

}
