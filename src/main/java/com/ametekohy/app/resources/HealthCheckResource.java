package com.ametekohy.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/health")
public class HealthCheckResource {

    @GET
    public String healthy() {
        return "Up & Running";
    }
}