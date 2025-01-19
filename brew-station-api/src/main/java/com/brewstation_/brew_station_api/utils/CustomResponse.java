package com.brewstation_.brew_station_api.utils;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse <T> {
    private T data;
    private String message;
    private Boolean error;
    private int code;

}