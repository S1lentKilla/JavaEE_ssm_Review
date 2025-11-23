package com.haust.pojo;

public class vo {
    private String username;
    private String jobs;
    private String phone;

    public vo(String username, String jobs, String phone) {
        this.username = username;
        this.jobs = jobs;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "vo{" +
                "username='" + username + '\'' +
                ", jobs='" + jobs + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
