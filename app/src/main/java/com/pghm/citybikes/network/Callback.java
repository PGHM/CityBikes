package com.pghm.citybikes.network;

/**
 * Created by Jussi on 30.6.2016.
 */
public interface Callback<T> {
    void callback(T result);
}
