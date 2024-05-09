package com.reservationapp.controller;

import com.reservationapp.payload.BusDto;
import com.reservationapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    private BusService busService;


    //http://localhost:9091/api/v1/bus/add
    @PostMapping("/add")
    public ResponseEntity<BusDto> addBus(@RequestBody BusDto busDto) throws ParseException{

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date parse = formatter.parse(busDto.getFromDate());
        Date parse1 = formatter.parse(busDto.getToDate());

        BusDto dto = busService.createBus(busDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }





}