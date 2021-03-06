package com.qiniu.pandora.logdb.repo;

import com.google.gson.annotations.SerializedName;

/**
 * 定义 LogdbRepo List 中的 Repo 属性
 */
public class RepoDesc {
    @SerializedName("name")
    public String name;
    @SerializedName("region")
    public String region;
    @SerializedName("retention")
    public String retention;
    @SerializedName("primaryField")
    public String primaryField;
    @SerializedName("fullText")
    public FullText fullText;
    @SerializedName("description")
    public String description;
    @SerializedName("createTime")
    public String createTime;
    @SerializedName("updateTime")
    public String updateTime;

    @Override
    public String toString() {
        return "RepoDesc{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", retention='" + retention + '\'' +
                ", primaryField='" + primaryField + '\'' +
                ", fullText=" + fullText +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
