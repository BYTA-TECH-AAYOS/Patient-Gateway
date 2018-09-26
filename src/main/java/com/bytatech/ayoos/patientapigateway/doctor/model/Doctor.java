package com.bytatech.ayoos.patientapigateway.doctor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Doctor.
 */
@Entity
@Table(name = "doctor")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "specialisation")
    private String specialisation;

    @OneToOne
    @JoinColumn(unique = true)
    private ProfileInfo profileInfo;

    @OneToOne
    @JoinColumn(unique = true)
    private Location location;

    @OneToOne
    @JoinColumn(unique = true)
    private ContactInfo contactInfo;

    @OneToOne
    @JoinColumn(unique = true)
    private DoctorSettings doctorSettings;

    @OneToOne
    @JoinColumn(unique = true)
    private Workspace workspace;

    /**
     * A relationship
     */
    @ApiModelProperty(value = "A relationship")
    @OneToMany(mappedBy = "doctor")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<DoctorSessionInfo> doctorSessionInfos = new HashSet<>();

    @OneToMany(mappedBy = "doctor")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ReservedSlot> reservedSlots = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public Doctor specialisation(String specialisation) {
        this.specialisation = specialisation;
        return this;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }

    public Doctor profileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }

    public void setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
    }

    public Location getLocation() {
        return location;
    }

    public Doctor location(Location location) {
        this.location = location;
        return this;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Doctor contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public DoctorSettings getDoctorSettings() {
        return doctorSettings;
    }

    public Doctor doctorSettings(DoctorSettings doctorSettings) {
        this.doctorSettings = doctorSettings;
        return this;
    }

    public void setDoctorSettings(DoctorSettings doctorSettings) {
        this.doctorSettings = doctorSettings;
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public Doctor workspace(Workspace workspace) {
        this.workspace = workspace;
        return this;
    }

    public void setWorkspace(Workspace workspace) {
        this.workspace = workspace;
    }

    public Set<DoctorSessionInfo> getDoctorSessionInfos() {
        return doctorSessionInfos;
    }

    public Doctor doctorSessionInfos(Set<DoctorSessionInfo> doctorSessionInfos) {
        this.doctorSessionInfos = doctorSessionInfos;
        return this;
    }

    public Doctor addDoctorSessionInfo(DoctorSessionInfo doctorSessionInfo) {
        this.doctorSessionInfos.add(doctorSessionInfo);
        doctorSessionInfo.setDoctor(this);
        return this;
    }

    public Doctor removeDoctorSessionInfo(DoctorSessionInfo doctorSessionInfo) {
        this.doctorSessionInfos.remove(doctorSessionInfo);
        doctorSessionInfo.setDoctor(null);
        return this;
    }

    public void setDoctorSessionInfos(Set<DoctorSessionInfo> doctorSessionInfos) {
        this.doctorSessionInfos = doctorSessionInfos;
    }

    public Set<ReservedSlot> getReservedSlots() {
        return reservedSlots;
    }

    public Doctor reservedSlots(Set<ReservedSlot> reservedSlots) {
        this.reservedSlots = reservedSlots;
        return this;
    }

    public Doctor addReservedSlot(ReservedSlot reservedSlot) {
        this.reservedSlots.add(reservedSlot);
        reservedSlot.setDoctor(this);
        return this;
    }

    public Doctor removeReservedSlot(ReservedSlot reservedSlot) {
        this.reservedSlots.remove(reservedSlot);
        reservedSlot.setDoctor(null);
        return this;
    }

    public void setReservedSlots(Set<ReservedSlot> reservedSlots) {
        this.reservedSlots = reservedSlots;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Doctor doctor = (Doctor) o;
        if (doctor.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), doctor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Doctor{" +
            "id=" + getId() +
            ", specialisation='" + getSpecialisation() + "'" +
            "}";
    }
}
