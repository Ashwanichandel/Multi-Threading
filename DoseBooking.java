package com.ashwani.Task_26_aug;

public class DoseBooking {
	private boolean booked;

	public void bookDose() {

		if (booked) {
			throw new RuntimeException("Dose is already booked");

		} else {
			this.booked = true;
		}

	}

	public boolean isDoseBooked() {
		if (booked) {
			return true;
		} else
			return false;
	}

}
