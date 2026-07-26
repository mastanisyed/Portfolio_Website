package Mastani.portfolio_website.dto;

public class DashboardResponse {

    private long totalContacts;
    private long totalProjects;
    private long totalCertificates;
    private long totalAdmins;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalContacts, long totalProjects,
                             long totalCertificates, long totalAdmins) {
        this.totalContacts = totalContacts;
        this.totalProjects = totalProjects;
        this.totalCertificates = totalCertificates;
        this.totalAdmins = totalAdmins;
    }

    public long getTotalContacts() {
        return totalContacts;
    }

    public void setTotalContacts(long totalContacts) {
        this.totalContacts = totalContacts;
    }

    public long getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(long totalProjects) {
        this.totalProjects = totalProjects;
    }

    public long getTotalCertificates() {
        return totalCertificates;
    }

    public void setTotalCertificates(long totalCertificates) {
        this.totalCertificates = totalCertificates;
    }

    public long getTotalAdmins() {
        return totalAdmins;
    }

    public void setTotalAdmins(long totalAdmins) {
        this.totalAdmins = totalAdmins;
    }
}