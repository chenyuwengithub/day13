package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    private Integer sid;

    private String sname;

    private String sex;

    private String hobby;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private Integer maid;
    
    @Transient // 自动给major对象赋值
    private Major major;
    
    @Transient
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startTime;
    
    @Transient
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endTime;
    
    
    

    public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	private static final long serialVersionUID = 1L;

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return maid
     */
    public Integer getMaid() {
        return maid;
    }

    /**
     * @param maid
     */
    public void setMaid(Integer maid) {
        this.maid = maid;
    }

    @Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", hobby=" + hobby + ", birthday="
				+ birthday + ", maid=" + maid + ", major=" + major + ", startTime=" + startTime + ", endTime=" + endTime
				+ "]";
	}
}