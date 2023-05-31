package com.psa.flight_reservation_app_5.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psa.flight_reservation_app_5.dto.ReservationRequest;
import com.psa.flight_reservation_app_5.entity.Flight;
import com.psa.flight_reservation_app_5.entity.Passenger;
import com.psa.flight_reservation_app_5.entity.Reservation;
import com.psa.flight_reservation_app_5.repository.FlightRepository;
import com.psa.flight_reservation_app_5.repository.PassengerRepository;
import com.psa.flight_reservation_app_5.repository.ReservationRepository;



@Service
public class ReservationServiceImpl implements ReservationService {
	


	@Autowired
	private PassengerRepository passengerRepo;	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
//	@Autowired
//	private PDFGenerator pdfGenerator;
//	
//	@Autowired
//	private EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {	
//		String fiePath ="C:\\Users\\swamesha k\\Documents\\workspace-spring-tool-suite-4-4.8.1.RELEASE\\flight_reservation_app_5\\tickets\\";
		
	Passenger passenger=new Passenger();
	passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
	Flight flight = findById.get();
	
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
	reservation.setNumberOfBags(0);
//	String fiePath ="C:\\Users\\swamesha k\\Documents\\workspace-spring-tool-suite-4-4.8.1.RELEASE\\flight_reservation_app_5\\tickets\\reservation"+reservation.getId()+".pdf";
		reservationRepo.save(reservation);
		
//		pdfGenerator.generateItinerary(reservation, fiePath);
//	
//		emailUtil.sendItinerary(passenger.getEmail(),fiePath);
	
	return reservation;
	}
}
