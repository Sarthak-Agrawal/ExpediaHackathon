package com.expedia.www.hackathon.backpackersPool.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;
    private Integer tuid;
    private String firstName;
    private String lastName;
    private String location;
    private Date date;
    private boolean trekking;
    private boolean religious;
    private boolean localInteraction;
    private boolean sports;
    private boolean sightseeing;
    private boolean nightlife;
    private String language;
    private boolean smoking;
    private Integer age;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
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

    @Override
    public String toString() {
        return "Trip{" +
                "tid=" + tid +
                ", tuid=" + tuid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", trekking=" + trekking +
                ", religious=" + religious +
                ", localInteraction=" + localInteraction +
                ", sports=" + sports +
                ", sightseeing=" + sightseeing +
                ", nightlife=" + nightlife +
                ", language='" + language + '\'' +
                ", smoking=" + smoking +
                ", age=" + age +
                '}';
    }
}
