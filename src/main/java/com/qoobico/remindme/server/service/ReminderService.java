package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.Util.HibernateUtil;
import com.qoobico.remindme.server.entity.taxi;
import org.hibernate.Session;

import java.util.List;

public interface ReminderService {

    List<taxi> getAll();
    List<taxi> getCheap();

    taxi getByID(long id);
    taxi save(taxi taxi);
    void remove(long id);


    //List<favorites> getAll();

}
