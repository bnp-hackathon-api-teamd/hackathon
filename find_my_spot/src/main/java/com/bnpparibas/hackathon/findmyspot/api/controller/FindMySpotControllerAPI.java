package com.bnpparibas.hackathon.findmyspot.api.controller;

import org.springframework.http.ResponseEntity;

public interface FindMySpotControllerAPI {

	/*TODO Create API that answers to the following needs:
	 *  - Assigns a user to an available parking lot in a specific building
	 *  - Informs to a user where is his assigned parking lot or if the user doesn't have any assigned park
	 *  - When the user enters in the building it marks the parking lot as occupied
	 *  - When the user leaves the building it marks the parking lot as free 
	 */


	public ResponseEntity<?> leave(Long employeeId,Long parkId);
	public ResponseEntity<?> enter(Long employeeId,Long parkId);

}
