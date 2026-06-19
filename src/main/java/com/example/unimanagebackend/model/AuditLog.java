package com.example.unimanagebackend.unimanage.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Audit_Log")
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

    @Column(name = "table_name",nullable = false,length = 50)
    private String tableName;

    @Column(name = "action_type",nullable = false,length = 10)
    private String actionType;

    @Column(name = "record_id",nullable = false)
    private Long recordId;

    @Column(name = "change_time",insertable = false,updatable = false)
    private LocalDateTime changeTime;

    @Lob
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;

    public AuditLog(){}

    public Long getLogId() {
        return logId;
    }

    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public Long getRecordId() {
        return recordId;
    }

    public String getActionType() {
        return actionType;
    }

    public String getDescription() {
        return description;
    }

    public String getTableName() {
        return tableName;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setChangeTime(LocalDateTime changeTime) {
        this.changeTime = changeTime;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
