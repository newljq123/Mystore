package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_room")
public class Room {
//    CREATE TABLE `tab_room` (
//            `room_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
//            `room_num` VARCHAR(20) DEFAULT NULL COMMENT '门牌号',
//            `room_name` VARCHAR(20) DEFAULT NULL COMMENT '会议室名称',
//            `room_size` INT(11) DEFAULT NULL COMMENT '会议室大小',
//            `room_status` VARCHAR(10) DEFAULT NULL COMMENT '会议室状态',
//            `remark` VARCHAR(500) DEFAULT NULL COMMENT '备注',
    @Id
    private Integer roomId;
    private String roomNum;
    private String roomName;
    private Integer roomSize;
    private String roomStatus;
    private String remark;

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNum='" + roomNum + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomSize=" + roomSize +
                ", roomStatus='" + roomStatus + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(Integer roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
