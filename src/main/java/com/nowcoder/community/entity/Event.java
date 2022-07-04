package com.nowcoder.community.entity;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private String topic;
    private int userId;
    private int entityType;
    private int entityId;
    // 实体作者
    private int entityUserId;
    // 事件对象要具有通用性，如果还有其他信息，用map封装
    private Map<String, Object> data = new HashMap<>();

    public String getTopic() {
        return topic;
    }

    // 返回Event,除了set topic,还希望set其他内容，因此返回Event
    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    // 只传一对key,value
    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
