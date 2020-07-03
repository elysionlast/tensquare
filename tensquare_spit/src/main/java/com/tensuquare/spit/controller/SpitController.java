package com.tensuquare.spit.controller;

import com.tensuquare.spit.Service.SpitService;
import com.tensuquare.spit.pojo.Spit;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spit")
public class SpitController {

    @Autowired
    private SpitService SpitService;

    @PostMapping
    public Result save(@RequestBody Spit spit){
        this.SpitService.save(spit);
        return new Result(true, StatusCode.OK,"save successful");
    }

    @PutMapping("{spitId}")
    public Result update(@PathVariable String spitid,@RequestBody Spit spit){
        spit.set_id(spitid);
        this.SpitService.update(spit);
        return new Result(true, StatusCode.OK,"update successful");
    }

    @GetMapping
    public Result findAll(){
        return new Result(true, StatusCode.OK,"findAll successful",this.SpitService.findAll());
    }

    @GetMapping("{spitId}")
    public Result findById(@PathVariable String id){
        return new Result(true, StatusCode.OK,"findById successful",this.SpitService.findById(id));
    }

    @DeleteMapping("{spitId}")
    public Result delete(@PathVariable String id){
        this.SpitService.delete(id);
        return new Result(true, StatusCode.OK,"delete successful");
    }
}
