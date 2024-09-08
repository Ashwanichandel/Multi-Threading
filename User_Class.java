package com.ashwani.Task_26_aug;

public class User_Class {

	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;

	public User_Class(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {

		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}

	public void bookDose() {
		if (eligibility.isEligible()) {
			try {
				doseBooking.bookDose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Sorry" + name + "You are not eligible for the vaccine.");

	}

	public void isDoseBooked() {
		if (doseBooking.isDoseBooked()) {
			System.out.println(name + " your appointment bboked for vacination");
		}

	}

}
