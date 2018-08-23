package com.example.polls.payload;

public class UserIdentityAvailability {
	private boolean available;

	public UserIdentityAvailability(boolean available) {
		super();
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
