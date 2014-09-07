package com.ihm.model;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.Size;

import com.ihm.model.StateInfo;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import javax.persistence.ManyToOne;

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
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@TableGenerator(name="id_sequence", table="id_sequence", pkColumnName="sequence_name",
//valueColumnName="next_id", initialValue=1000,allocationSize=1, pkColumnValue="address")
public class Address {

	/*
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE , generator="id_sequence")
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;


    @Size(max = 1)
    private String addressType;


    private String address1;


    private String address2;


    private String address3;


    private String city;



    @ManyToOne
    private StateInfo stateInfo;


    private String zip;


    private Long latitude;


    private Long longitude;


    @Size(max = 1)
    private String disableFlg;


    @Size(max = 16)
    private String createdBy;


    @Size(max = 16)
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date createdOn;


    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date updatedOn;


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

	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static Address fromJsonToCustomerAddress(String json) {
        return new JSONDeserializer<Address>()
        .use(null, Address.class).deserialize(json);
    }

	public static String toJsonArray(Collection<Address> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<Address> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<Address> fromJsonArrayToAddresses(String json) {
        return new JSONDeserializer<List<Address>>()
        .use("values", Address.class).deserialize(json);
    }

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	public String getAddressType() {
        return this.addressType;
    }

	public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

	public String getAddress1() {
        return this.address1;
    }

	public void setAddress1(String address1) {
        this.address1 = address1;
    }

	public String getAddress2() {
        return this.address2;
    }

	public void setAddress2(String address2) {
        this.address2 = address2;
    }

	public String getAddress3() {
        return this.address3;
    }

	public void setAddress3(String address3) {
        this.address3 = address3;
    }

	public String getCity() {
        return this.city;
    }

	public void setCity(String city) {
        this.city = city;
    }

	public StateInfo getStateInfo() {
        return this.stateInfo;
    }

	public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

	public String getZip() {
        return this.zip;
    }

	public void setZip(String zip) {
        this.zip = zip;
    }

	public Long getLatitude() {
        return this.latitude;
    }

	public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

	public Long getLongitude() {
        return this.longitude;
    }

	public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

	public String getDisableFlg() {
        return this.disableFlg;
    }

	public void setDisableFlg(String disableFlg) {
        this.disableFlg = disableFlg;
    }

	public String getCreatedBy() {
        return this.createdBy;
    }

	public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

	public String getUpdatedBy() {
        return this.updatedBy;
    }

	public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

	public Date getCreatedOn() {
        return this.createdOn;
    }

	public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

	public Date getUpdatedOn() {
        return this.updatedOn;
    }

	public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
    
    */
}
