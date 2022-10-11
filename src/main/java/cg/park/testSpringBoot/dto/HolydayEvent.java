package cg.park.testSpringBoot.dto;

import java.util.Date;

public class HolydayEvent {

    private String holydayGrade;
    private String grade;
    private String type;
    private int typeCount;
    private String regId;
    private Date regDate;
    private String chdId;
    private Date chgDate;

    private String eventId;
    private String viewName;
    private String subName;

    private String bannerFg;

    private String seq;
    private String title;

    public String getHolydayGrade() {
        return holydayGrade;
    }

    public void setHolydayGrade(String holydayGrade) {
        this.holydayGrade = holydayGrade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeCount() {
        return typeCount;
    }

    public void setTypeCount(int typeCount) {
        this.typeCount = typeCount;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getChdId() {
        return chdId;
    }

    public void setChdId(String chdId) {
        this.chdId = chdId;
    }

    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getBannerFg() {
        return bannerFg;
    }

    public void setBannerFg(String bannerFg) {
        this.bannerFg = bannerFg;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
