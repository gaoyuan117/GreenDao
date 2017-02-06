package com.jzbwlkj.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：admin on 2017/2/6 13:44
 */

@Entity
public class Student {

    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "uid")
    @NotNull
    @Unique
    private String uid;
    @Property(nameInDb = "name")
    private String name;

    private String sex;

    @Generated(hash = 436958144)
    public Student(Long id, @NotNull String uid, String name, String sex) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.sex = sex;
    }

    @Generated(hash = 1556870573)
    public Student() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
