package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.taxi;
import com.qoobico.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;

    public List<taxi> getAll() {
        return repository.findAll();
    }

    public taxi getByID(long id) {
        return repository.findOne(id);
    }

    public taxi save(taxi taxi) {
        return repository.saveAndFlush(taxi);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
