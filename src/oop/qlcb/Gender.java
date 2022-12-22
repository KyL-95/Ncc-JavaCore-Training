package oop.qlcb;

public enum Gender {
	GENDER_MALE("Nam"), GENDER_FEMALE("Nữ"), GENDER_UNKNOWN("Khác");

	private String gender;


	Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;

	}

}
