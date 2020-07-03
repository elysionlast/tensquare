package com.tensuquare.spit.Service;

import com.tensuquare.spit.dao.SpitDao;
import com.tensuquare.spit.pojo.Spit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import java.util.List;

@Service
@Transactional
public class SpitService {
    @Autowired
    private SpitDao spitDao;

    @Autowired
    private IdWorker idWorker;

    public List<Spit> findAll() {
        return this.spitDao.findAll();
    }

    public Spit findById(String id){
        return this.spitDao.findById(id).get();
    }

    public void save(Spit spit){
        spit.set_id(idWorker.nextId()+"");
        this.spitDao.save(spit);
    }

    public void update(Spit spit){
        this.spitDao.save(spit);
    }

    public void delete(String id){
        this.spitDao.deleteById(id);
    }
}
