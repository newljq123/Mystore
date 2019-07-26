package com.czxy.score.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_user_metting")
public class UserAndMetting {
    //      `umid` INT(11) NOT NULL AUTO_INCREMENT,
//  `user_id` INT(11) DEFAULT NULL,
//  `metting_id` INT(11) DEFAULT NULL,
    private Integer umid;
    private Integer userId;
    private Integer mettingId;

    @Override
    public String toString() {
        return "UserAndMetting{" +
                "umid=" + umid +
                ", userId=" + userId +
                ", mettingId=" + mettingId +
                '}';
    }

    public Integer getUmid() {
        return umid;
    }

    public void setUmid(Integer umid) {
        this.umid = umid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMettingId() {
        return mettingId;
    }

    public void setMettingId(Integer mettingId) {
        this.mettingId = mettingId;
    }
}
