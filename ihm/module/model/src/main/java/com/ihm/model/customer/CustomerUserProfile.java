package com.ihm.model.customer;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import javax.validation.constraints.Size;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

import com.ihm.model.Address;
import com.ihm.model.UserProfile;

import javax.persistence.ManyToOne;

@Entity
@Table(name="CST_USER_PROFILE")
@PrimaryKeyJoinColumn(name="ID")
public class CustomerUserProfile extends UserProfile{

    /**
     */
    @Size(max = 16)
    private String emergencyContactNo;

    /**
     */
    @ManyToOne
    private CustomerAddress address;

    /**
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID")
    private CustomerUserCredential userId;

    
	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static CustomerUserProfile fromJsonToCustomerUserProfile(String json) {
        return new JSONDeserializer<CustomerUserProfile>()
        .use(null, CustomerUserProfile.class).deserialize(json);
    }

	public static String toJsonArray(Collection<CustomerUserProfile> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<CustomerUserProfile> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<CustomerUserProfile> fromJsonArrayToCustomerUserProfiles(String json) {
        return new JSONDeserializer<List<CustomerUserProfile>>()
        .use("values", CustomerUserProfile.class).deserialize(json);
    }


	public String getEmergencyContactNo() {
        return this.emergencyContactNo;
    }

	public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }


	public CustomerAddress getAddress() {
        return this.address;
    }

	public void setAddress(CustomerAddress address) {
        this.address = address;
    }

	public CustomerUserCredential getUserId() {
        return this.userId;
    }

	public void setUserId(CustomerUserCredential userId) {
        this.userId = userId;
    }

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
