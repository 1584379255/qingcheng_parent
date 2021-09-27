package com.qingcheng.controller.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.service.order.CategoryReportService;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderTask {


  @Reference
    private CategoryReportService categoryReportService;

    @Scheduled(cron = "0 * * * * ?")
    public void createCategoryReportData() {
        System.out.println("数据进行存储");
        System.out.println(categoryReportService);
        categoryReportService.createData();

    }

}
