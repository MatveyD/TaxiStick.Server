package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.remind;
import com.qoobico.remindme.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;

    public List<remind> getAll() {
        return repository.findAll();
    }

    public remind getByID(long id) {
        return repository.findOne(id);
    }

    public remind save(remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
