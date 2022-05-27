package org.example.service;

import org.example.dto.RideRequest;
import org.example.dto.RideResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "RideRequesterService")
public class RideRequesterService {
    public @WebResult(name = "response") RideResponse processRide(@WebParam RideRequest rideRequest) {
        RideResponse rideResponse = new RideResponse();
        rideResponse.setAccepted(true);
        return rideResponse;
    }
}
