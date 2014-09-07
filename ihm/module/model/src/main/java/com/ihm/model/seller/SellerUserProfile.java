package com.ihm.model.seller;
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

import com.ihm.model.UserProfile;

import javax.persistence.ManyToOne;

@Entity
@Table(name="SLR_USER_PROFILE")
@PrimaryKeyJoinColumn(name="ID")
public class SellerUserProfile extends UserProfile{

    /**
     */
    @ManyToOne
    private SellerInfo sellerInfo;

    /**
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID")
    private SellerUserCredential internalUserId;

	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static SellerUserProfile fromJsonToSellerUserProfile(String json) {
        return new JSONDeserializer<SellerUserProfile>()
        .use(null, SellerUserProfile.class).deserialize(json);
    }

	public static String toJsonArray(Collection<SellerUserProfile> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<SellerUserProfile> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<SellerUserProfile> fromJsonArrayToSellerUserProfiles(String json) {
        return new JSONDeserializer<List<SellerUserProfile>>()
        .use("values", SellerUserProfile.class).deserialize(json);
    }

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	public SellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

	public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

	public SellerUserCredential getInternalUserId() {
        return this.internalUserId;
    }

	public void setInternalUserId(SellerUserCredential internalUserId) {
        this.internalUserId = internalUserId;
    }


}
