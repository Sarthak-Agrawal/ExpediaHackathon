package com.expedia.www.hackathon.backpackersPool.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;
    private Integer tuid;
    private String location;
    private Date initialDate;
    private Date finalDate;
    private boolean trekking;
    private boolean religious;
    private boolean localInteraction;
    private boolean sports;
    private boolean sightseeing;
    private boolean nightlife;
    private Integer language;
    private boolean smoking;
    private Integer age;

    //tid integer PRIMARY KEY , tuid integer , location varchar(100), time timestamp, trekking tinyint(1),religious tinyint(1),
    // localinteraction tinyint(1), sightseeing tinyint(1) , nightlife tinyint(1),language_preffered tinyint(1),
    // smoking_preffered tinyint(1), age_group tinyint(1))


    @Override
    public String toString() {
        return "Trip{" +
                "tid=" + tid +
                ", tuid=" + tuid +
                ", location='" + location + '\'' +
                ", initialDate=" + initialDate +
                ", finalDate=" + finalDate +
                ", trekking=" + trekking +
                ", religious=" + religious +
                ", localInteraction=" + localInteraction +
                ", sports=" + sports +
                ", sightseeing=" + sightseeing +
                ", nightlife=" + nightlife +
                ", language=" + language +
                ", smoking=" + smoking +
                ", age=" + age +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isTrekking() {
        return trekking;
    }

    public void setTrekking(boolean trekking) {
        this.trekking = trekking;
    }

    public boolean isReligious() {
        return religious;
    }

    public void setReligious(boolean religious) {
        this.religious = religious;
    }

    public boolean isLocalInteraction() {
        return localInteraction;
    }

    public void setLocalInteraction(boolean localInteraction) {
        this.localInteraction = localInteraction;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }

    public boolean isSightseeing() {
        return sightseeing;
    }

    public void setSightseeing(boolean sightseeing) {
        this.sightseeing = sightseeing;
    }

    public boolean isNightlife() {
        return nightlife;
    }

    public void setNightlife(boolean nightlife) {
        this.nightlife = nightlife;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

}