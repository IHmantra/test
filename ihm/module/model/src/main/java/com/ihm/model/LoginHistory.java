package com.ihm.model;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import javax.validation.constraints.Size;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="IHM_LOGIN_HISTORY")
@TableGenerator(name="id_sequence", table="id_sequence", pkColumnName="sequence_name",
valueColumnName="next_id", initialValue=1000,allocationSize=1, pkColumnValue="ihm_login_history")
public class LoginHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator="id_sequence")
    @Column(name = "id")
    private Long id;
 
	@Version
    @Column(name = "version")
    private Integer version;
	
    private UserProfile userProfile;

    @Size(max = 100)
    private String sessionId;

    @Size(max = 50)
    private String userAgent;

    /**
     */
    @Size(max = 40)
    private String ipAddress;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date startedOn;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date logoutOn;

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }



	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static LoginHistory fromJsonToCountry(String json) {
        return new JSONDeserializer<LoginHistory>()
        .use(null, LoginHistory.class).deserialize(json);
    }

	public static String toJsonArray(Collection<LoginHistory> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<LoginHistory> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<LoginHistory> fromJsonArrayToCountrys(String json) {
        return new JSONDeserializer<List<LoginHistory>>()
        .use("values", LoginHistory.class).deserialize(json);
    }



	public Long getId() {
        return this.id;
    }

	public void setId(Long id) {
        this.id = id;
    }

	public Integer getVersion() {
        return this.version;
    }

	public void setVersion(Integer version) {
        this.version = version;
    }



	public UserProfile getUserProfile() {
		return userProfile;
	}



	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}



	public String getSessionId() {
		return sessionId;
	}



	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}



	public String getUserAgent() {
		return userAgent;
	}



	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}



	public String getIpAddress() {
		return ipAddress;
	}



	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}



	public Date getStartedOn() {
		return startedOn;
	}



	public void setStartedOn(Date startedOn) {
		this.startedOn = startedOn;
	}



	public Date getLogoutOn() {
		return logoutOn;
	}



	public void setLogoutOn(Date logoutOn) {
		this.logoutOn = logoutOn;
	}
}
