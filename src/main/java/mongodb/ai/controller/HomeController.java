package mongodb.ai.controller;

import mongodb.ai.common.Constant;
import mongodb.ai.dao.EventDAO;
import mongodb.ai.dao.LongEventDAO;
import mongodb.ai.dto.Articles;
import mongodb.ai.dto.Long_events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    EventDAO eventDAO;

    @Autowired
    LongEventDAO longEventDAO;

    @RequestMapping(value = {"/", "/home"})
    public String homePage(Model model) {

        //default get data from yesterday when load page;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String yesterday = dateFormat.format(cal.getTime());
        model.addAttribute("time", yesterday);

        //get data according to category which defind in common
        List<Long_events> data_gd = longEventDAO.findData(yesterday, Constant.Category.GD);
        List<Long_events> data_tt = longEventDAO.findData(yesterday, Constant.Category.TT);
        List<Long_events> data_gt = longEventDAO.findData(yesterday, Constant.Category.GT);
        List<Long_events> data_tg = longEventDAO.findData(yesterday, Constant.Category.TG);
        List<Long_events> data_xh = longEventDAO.findData(yesterday, Constant.Category.XH);
        List<Long_events> data_vh = longEventDAO.findData(yesterday, Constant.Category.VH);
        List<Long_events> data_ds = longEventDAO.findData(yesterday, Constant.Category.DS);
        List<Long_events> data_pl = longEventDAO.findData(yesterday, Constant.Category.PL);
        List<Long_events> data_kt = longEventDAO.findData(yesterday, Constant.Category.KT);
        List<Long_events> data_nd = longEventDAO.findData(yesterday, Constant.Category.ND);
        List<Long_events> data_kh = longEventDAO.findData(yesterday, Constant.Category.KH);
        List<Long_events> data_cn = longEventDAO.findData(yesterday, Constant.Category.CN);
        List<Long_events> data_xc = longEventDAO.findData(yesterday, Constant.Category.XC);

        model.addAttribute("data_gd", data_gd);
        model.addAttribute("data_tt", data_tt);
        model.addAttribute("data_gt", data_gt);
        model.addAttribute("data_tg", data_tg);
        model.addAttribute("data_xh", data_xh);
        model.addAttribute("data_vh", data_vh);
        model.addAttribute("data_ds", data_ds);
        model.addAttribute("data_pl", data_pl);
        model.addAttribute("data_kt", data_kt);
        model.addAttribute("data_nd", data_nd);
        model.addAttribute("data_kh", data_kh);
        model.addAttribute("data_cn", data_cn);
        model.addAttribute("data_xc", data_xc);
        return "home";
    }

}
