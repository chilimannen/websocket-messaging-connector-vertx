package com.websocket.chat.connector.Protocol;

/**
 * Created by Robin on 2015-12-16.
 * <p>
 * Transfer object for querying a room or returning a query response.
 */
public class RoomInfo {
    private String topic;
    private String room;
    private String owner;
    private Header header;
    private String username;
    private Boolean created;

    public RoomInfo() {
    }

    public String getOwner() {
        return owner;
    }

    public RoomInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String name) {
        this.room = name;
    }
}