package org.aivean.teamcity.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Date;

/**
 * @author izaytsev
 *         3/1/12 12:46 AM
 */
@XStreamAlias("build")
public class Build {

//    <build id="5"number="5"status="ERROR"buildTypeId="bt2"startDate="20120229T224143+0200"href="/httpAuth/app/rest" +
//            "/builds/id:5"webUrl="http://localhost:8111/viewLog.html?buildId=5&buildTypeId=bt2"/>

    Integer id;
    String number;
    
    @XStreamAsAttribute
    BuildStatus status;
    String buildTypeId;
    String buildType;
    String href;
    String statusText;

    Boolean running = false;

    Date startDate;
    Date finishDate;
    
    String agent;
    String tags;
    String properties;
    String revisions;
    String changes;
    String relatedIssues;
    
    String comment;

    User user;


    @XStreamAlias("snapshot-dependencies")
    String snapshotDependencies;

    @XStreamAlias("artifact-dependencies")
    String artifactDependencies;

    @XStreamAlias("dependency-build")
    String dependencyBuild;

    @XStreamAlias("triggered")
    String triggered;


    @XStreamAlias("running-info")
    RunningInfo runningInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BuildStatus getStatus() {
        return status;
    }

    public void setStatus(BuildStatus status) {
        this.status = status;
    }

    public String getBuildTypeId() {
        return buildTypeId;
    }

    public void setBuildTypeId(String buildTypeId) {
        this.buildTypeId = buildTypeId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public RunningInfo getRunningInfo() {
        return runningInfo;
    }

    public void setRunningInfo(RunningInfo runningInfo) {
        this.runningInfo = runningInfo;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getRelatedIssues() {
        return relatedIssues;
    }

    public void setRelatedIssues(String relatedIssues) {
        this.relatedIssues = relatedIssues;
    }

    public String getRevisions() {
        return revisions;
    }

    public void setRevisions(String revisions) {
        this.revisions = revisions;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDependencyBuild() {
        return dependencyBuild;
    }

    public void setDependencyBuild(String dependencyBuild) {
        this.dependencyBuild = dependencyBuild;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
