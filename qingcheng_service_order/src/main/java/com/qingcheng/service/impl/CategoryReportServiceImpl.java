package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qingcheng.dao.CategoryReportMapper;
import com.qingcheng.pojo.order.CategoryReport;
import com.qingcheng.service.order.CategoryReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = CategoryReportService.class)
public  class CategoryReportServiceImpl implements CategoryReportService{



    @Autowired
    private CategoryReportMapper categoryReportMapper;


    public List<CategoryReport> categoryReport(LocalDate date) {

        return categoryReportMapper.categoryReport(date);
    }



    @Override
    @Transactional
    public void createData() {
        //获取数据

        String str = "2019-01-26";
        //指定转换格式
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //进行转换
        LocalDate date = LocalDate.parse(str, fmt);
        List<CategoryReport> categoryReports = categoryReportMapper.categoryReport(date);

        //数据存储到数据库中
        for (CategoryReport categoryReport : categoryReports) {
            System.out.println("");
            categoryReportMapper.insert(categoryReport);
        }

    }

    @Override
    public List<Map> category1Count(String date1, String date2) {
        return categoryReportMapper.category1Count(date1,date2);
    }
}
