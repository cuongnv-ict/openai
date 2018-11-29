package mongodb.ai.controller;

import mongodb.ai.common.Constant;
import mongodb.ai.dao.LongEventDAO;
import mongodb.ai.dto.Long_events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    LongEventDAO longEventDAO;

    @RequestMapping(value = "/get_event_gd")
    public ResponseEntity getEventGD(String date){
        List<Long_events> data_gd = longEventDAO.findData(date, Constant.Category.GD);
        return ResponseEntity.ok(data_gd);
    }
    @RequestMapping(value = "/get_event_tt")
    public ResponseEntity getEventTT(String date){
        List<Long_events> data_tt = longEventDAO.findData(date, Constant.Category.TT);
        return ResponseEntity.ok(data_tt);
    }
    @RequestMapping(value = "/get_event_gt")
    public ResponseEntity getEventGT(String date){
        List<Long_events> data_gt = longEventDAO.findData(date, Constant.Category.GT);
        return ResponseEntity.ok(data_gt);
    }
    @RequestMapping(value = "/get_event_tg")
    public ResponseEntity getEventTG(String date){
        List<Long_events> data_tg = longEventDAO.findData(date, Constant.Category.TG);
        return ResponseEntity.ok(data_tg);
    }
    @RequestMapping(value = "/get_event_xh")
    public ResponseEntity getEventXH(String date){
        List<Long_events> data_xh = longEventDAO.findData(date, Constant.Category.XH);
        return ResponseEntity.ok(data_xh);
    }
    @RequestMapping(value = "/get_event_vh")
    public ResponseEntity getEventVH(String date){
        List<Long_events> data_vh = longEventDAO.findData(date, Constant.Category.VH);
        return ResponseEntity.ok(data_vh);
    }
    @RequestMapping(value = "/get_event_ds")
    public ResponseEntity getEventDS(String date){
        List<Long_events> data_ds = longEventDAO.findData(date, Constant.Category.DS);
        return ResponseEntity.ok(data_ds);
    }
    @RequestMapping(value = "/get_event_pl")
    public ResponseEntity getEventPL(String date){
        List<Long_events> data_pl = longEventDAO.findData(date, Constant.Category.PL);
        return ResponseEntity.ok(data_pl);
    }
    @RequestMapping(value = "/get_event_kt")
    public ResponseEntity getEventKT(String date){
        List<Long_events> data_kt = longEventDAO.findData(date, Constant.Category.KT);
        return ResponseEntity.ok(data_kt);
    }
    @RequestMapping(value = "/get_event_nd")
    public ResponseEntity getEventND(String date){
        List<Long_events> data_nd = longEventDAO.findData(date, Constant.Category.ND);
        return ResponseEntity.ok(data_nd);
    }
    @RequestMapping(value = "/get_event_kh")
    public ResponseEntity getEventKH(String date){
        List<Long_events> data_kh = longEventDAO.findData(date, Constant.Category.KH);
        return ResponseEntity.ok(data_kh);
    }
    @RequestMapping(value = "/get_event_cn")
    public ResponseEntity getEventCN(String date){
        List<Long_events> data_cn = longEventDAO.findData(date, Constant.Category.CN);
        return ResponseEntity.ok(data_cn);
    }
    @RequestMapping(value = "/get_event_xc")
    public ResponseEntity getEventXC(String date){
        List<Long_events> data_xc = longEventDAO.findData(date, Constant.Category.XC);
        return ResponseEntity.ok(data_xc);
    }

}
