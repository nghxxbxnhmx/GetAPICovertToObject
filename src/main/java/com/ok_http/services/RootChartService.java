package com.ok_http.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ok_http.models.RootChartModel;

@Service
public interface RootChartService {
    RootChartModel getDataRootChart();
    String process();
}