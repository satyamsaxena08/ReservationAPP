package com.reservationapp.payload;

import com.reservationapp.entity.Driver;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class BusDto {


    private long busID; // Primary key

    private String busNumber;
    private String busType;
    private String fromLocation;
    private String toLocation;
    private String fromDate; // Converted from String
    private String toDate;   // Converted from String
    private String totalDuration;
    private String fromTime;
    private String toTime;
    private double price;
    private int totalSeats;
    private int availableSeats;

    private Driver driver;

}
