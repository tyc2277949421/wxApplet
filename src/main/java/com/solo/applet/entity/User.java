package com.solo.applet.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "user")
public class User extends BaseModel {

    @Column(name = "username",type = MySqlTypeConstant.VARCHAR)
    private String username;

    @Column(name = "avatarUrl",type = MySqlTypeConstant.VARCHAR)
    private String avatarUrl;

    @Column(name = "openpid", type = MySqlTypeConstant.VARCHAR,isKey = true)
    private String openpid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getOpenpid() {
        return openpid;
    }

    public void setOpenpid(String openpid) {
        this.openpid = openpid;
    }
}
