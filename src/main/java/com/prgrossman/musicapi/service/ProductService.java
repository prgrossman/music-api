package com.prgrossman.musicapi.service;

public abstract class ProductService<T, R> {
//T = the type of object the service will create (Guitar, Piano, etc)
//R = the type of request or input data (GuitarRequest, PianoRequest, etc)
//T & R are generic type parameters that are decided when this class is extended.

    public abstract T create(R request);


}
