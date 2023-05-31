//package com.psa.flight_reservation_app_5.util;
//
//import java.io.FileOutputStream;
//
//import org.springframework.stereotype.Component;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.psa.flight_reservation_app_5.entity.Reservation;
//
//@Component
//public class PDFGenerator {
//	
//	private static Font catFont=new Font(Font.FontFamily.TIMES_ROMAN,18,
//			Font.BOLD);
//	private static Font smallBold=new Font(Font.FontFamily.TIMES_ROMAN,12,
//			Font.BOLD);
//	
//	public void generateItinerary(Reservation reservation,String filePath) {
//	
//		try {
//			Document document=new Document();
//			PdfWriter.getInstance(document, new FileOutputStream(filePath));
//			document.open();
//			addMetaData(document);
//			addTitleAndTable(document,firstName,email,phone,operatingAirline,dateOfDeparture.toString(),departureCity,arrivalCity);
//			document.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//	private PdfPTable generateTable(Reservation reservation) {
//		PdfPTable table=new PdfPTable(2);
//		PdfPCell cell;
//		
//		cell=new PdfPCell(new Phrase("Flight Itinerary"));
//		cell.setColspan(2);
//		table .addCell(cell);
//		
//		cell= new PdfPCell(new Phrase("Flight Details"));
//		cell.setColspan(2);
//		table .addCell(cell);
//		
//		table.addCell("Deperature City");
//		table.addCell(reservation.getFlight().getDepartureCity());
//		
//		table.addCell("Arrival City");
//		table.addCell(reservation.getFlight().getArrivalCity());
//		
//		table.addCell("Flight Number");
//		table.addCell(reservation.getFlight().getFlightNumber());
//		
////		table.addCell("Departure Date");
////		table.addCell(reservation.getFlight().getDateOfDeparture().);
////		
//		
//		
//		return null;
//	}
//	
//
//}
