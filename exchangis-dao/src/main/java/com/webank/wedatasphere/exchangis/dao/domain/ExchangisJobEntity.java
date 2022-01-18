package com.webank.wedatasphere.exchangis.dao.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("exchangis_job_info")
public class ExchangisJobEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("project_id")
    private Long projectId;

    @TableField("dss_project_id")
    private Long dssProjectId;

    @TableField("node_id")
    private String nodeId;

    @TableField("node_name")
    private String nodeName;

    private String jobName;

    private String jobType;

    private String engineType;

    private String jobLabels;

    private String jobDesc;

    private String content;

    private String alarmUser;

    private Integer alarmLevel;

    private String proxyUser;

    private String executeNode;

    private String syncType;

    private String jobParams;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUser;

    private Map<String, Object> sourceMap = new HashMap<>();

    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        getSourceMap().put("projectId", projectId);
        this.projectId = projectId;
    }

    public Long getDssProjectId() {
        if (Objects.isNull(dssProjectId)){
            this.dssProjectId = Long.parseLong(String.valueOf(getSourceMap().get("dssProjectId")));
        }
        return dssProjectId;
    }

    public void setDssProjectId(Long dssProjectId) { this.dssProjectId = dssProjectId; }

    public String getNodeId() { return nodeId; }

    public void setNodeId(String nodeId) { this.nodeId = nodeId; }

    public String getNodeName() { return nodeName; }

    public void setNodeName(String nodeName) { this.nodeName = nodeName; }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getJobLabels() {
        return jobLabels;
    }

    public void setJobLabels(String jobLabels) {
        this.jobLabels = jobLabels;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAlarmUser() {
        return alarmUser;
    }

    public void setAlarmUser(String alarmUser) {
        this.alarmUser = alarmUser;
    }

    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public String getExecuteNode() {
        return executeNode;
    }

    public void setExecuteNode(String executeNode) {
        this.executeNode = executeNode;
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public String getJobParams() {
        return jobParams;
    }

    public void setJobParams(String jobParams) {
        this.jobParams = jobParams;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Map<String, Object> getSourceMap() {
        return sourceMap;
    }

    public void setSourceMap(Map<String, Object> sourceMap) {
        this.sourceMap = sourceMap;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}