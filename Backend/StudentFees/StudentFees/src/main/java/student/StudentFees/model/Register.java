package student.StudentFees.model;


import jakarta.persistence.*;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Personal Info
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;

    // Contact Info
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String country;

    // Academic Info
    private String className;
    private String section;
    private String stream;
    private String previousSchool;

    // Parent Info
    private String parentName;
    private String parentPhone;
    private String parentEmail;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String firstName, String lastName, String dob, String gender, String email, String phone,
			String address, String city, String state, String pincode, String country, String className, String section,
			String stream, String previousSchool, String parentName, String parentPhone, String parentEmail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.className = className;
		this.section = section;
		this.stream = stream;
		this.previousSchool = previousSchool;
		this.parentName = parentName;
		this.parentPhone = parentPhone;
		this.parentEmail = parentEmail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getPreviousSchool() {
		return previousSchool;
	}
	public void setPreviousSchool(String previousSchool) {
		this.previousSchool = previousSchool;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentPhone() {
		return parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

   
}