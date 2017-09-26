package com.decorate.ssm.po;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private Date createdt;

    private String createauthor;

    private Integer noticetypeId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getCreateauthor() {
        return createauthor;
    }

    public void setCreateauthor(String createauthor) {
        this.createauthor = createauthor == null ? null : createauthor.trim();
    }

    public Integer getNoticetypeId() {
        return noticetypeId;
    }

    public void setNoticetypeId(Integer noticetypeId) {
        this.noticetypeId = noticetypeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}