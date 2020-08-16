package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Major implements Serializable {
    @Id
    private Integer maid;

    private String maname;
    
    private static final long serialVersionUID = 1L;

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

    /**
     * @return maname
     */
    public String getManame() {
        return maname;
    }

    /**
     * @param maname
     */
    public void setManame(String maname) {
        this.maname = maname == null ? null : maname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", maid=").append(maid);
        sb.append(", maname=").append(maname);
        sb.append("]");
        return sb.toString();
    }
}