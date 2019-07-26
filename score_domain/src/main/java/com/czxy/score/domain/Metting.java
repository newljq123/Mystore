package com.czxy.score.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tab_metting")
public class Metting {
//      `metting_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
//            `metting_name` VARCHAR(30) DEFAULT NULL COMMENT '会议名称',
//            `metting_size` INT(11) DEFAULT NULL COMMENT '预计参会人数',
//            `metting_starttime` DATETIME DEFAULT NULL COMMENT '会议开始时间',
//            `metting_endtime` DATETIME DEFAULT NULL COMMENT '会议结束时间',
//            `metting_ordertime` DATETIME DEFAULT NULL COMMENT '会议预定时间',
//            `remark` VARCHAR(200) DEFAULT NULL COMMENT '会议说明',
//            `status` VARCHAR(10) DEFAULT NULL COMMENT '会议状态',
//            `username` VARCHAR(30) DEFAULT NULL COMMENT '预定者',
//            `room_id` INT(11) DEFAULT NULL COMMENT '会议室ID',
        @Id
    private Integer mettingId;
    private String mettingName;
    private Integer mettingSize;
    private Date mettingStarttime;
    private Date mettingEndtime;
    private String remark;
    private String status;
    private String username;
    private Integer roomId;
    private Room room;
    private List<User> user =new ArrayList<>();

    @Override
    public String toString() {
        return "Metting{" +
                "mettingId=" + mettingId +
                ", mettingName='" + mettingName + '\'' +
                ", mettingSize=" + mettingSize +
                ", mettingStarttime=" + mettingStarttime +
                ", mettingEndtime=" + mettingEndtime +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", roomId=" + roomId +
                ", room=" + room +
                ", user=" + user +
                '}';
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getMettingName() {
        return mettingName;
    }

    public void setMettingName(String mettingName) {
        this.mettingName = mettingName;
    }

    public Integer getMettingSize() {
        return mettingSize;
    }

    public void setMettingSize(Integer mettingSize) {
        this.mettingSize = mettingSize;
    }

    public String getMettingStarttime() {
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(mettingStarttime);
        return format;
    }

    public void setMettingStarttime(Date mettingStarttime) {
        this.mettingStarttime = mettingStarttime;
    }

    public String getMettingEndtime() {
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(mettingEndtime);
        return format;
    }

    public void setMettingEndtime(Date mettingEndtime) {
        this.mettingEndtime = mettingEndtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getMettingId() {
        return mettingId;
    }

    public void setMettingId(Integer mettingId) {
        this.mettingId = mettingId;
    }
}
