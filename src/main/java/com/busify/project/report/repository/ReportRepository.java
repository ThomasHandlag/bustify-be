package com.busify.project.report.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.busify.project.report.entity.ReportEntity;
import java.util.List;
import java.time.Instant;


public interface ReportRepository extends MongoRepository<ReportEntity, String> {

    List<ReportEntity> findByReportDate(Instant reportDate);
    List<ReportEntity> findByOperatorId(Long operatorId);
}
