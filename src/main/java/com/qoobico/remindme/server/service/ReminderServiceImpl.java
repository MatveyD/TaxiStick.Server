package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.taxi;
import com.qoobico.remindme.server.repository.RemindRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qoobico.remindme.server.Util.HibernateUtil;
import com.qoobico.remindme.server.entity.taxi;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;

    // Метод возвращает список самых выгодных
    public List<taxi> getCheap(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        //чтобы не ругался


        List result = session.createQuery(" FROM taxi WHERE rubin   ORDER BY rubkm DESC").list();
        session.getTransaction().commit();
    return result;
}

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
