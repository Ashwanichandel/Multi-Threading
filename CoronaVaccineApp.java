package com.ashwani.Task_26_aug;

//import java.util.Scanner;

public class CoronaVaccineApp {
	public static void main(String[] args) {

		VaccineEligibility v1 = new VaccineEligibility(20, true);
		DoseBooking d1 = new DoseBooking();
		User_Class u1 = new User_Class("Geller", v1, d1);

		VaccineEligibility v2 = new VaccineEligibility(16, true);
		DoseBooking d2 = new DoseBooking();
		User_Class u2 = new User_Class("Scoot", v2, d2);

		Runnable r = new Runnable() {

			@Override
			public void run() {

				u1.bookDose();
				u1.isDoseBooked();

			}
		};

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				u2.bookDose();
				u2.isDoseBooked();

			}
		};

		Thread thread1 = new Thread(r);
		Thread thread2 = new Thread(r1);

		thread1.start();
		thread2.start();

	}
}
