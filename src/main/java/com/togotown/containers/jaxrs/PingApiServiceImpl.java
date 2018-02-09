package com.togotown.containers.jaxrs;

import swagger.jaxrs.ApiResponseMessage;
import swagger.jaxrs.NotFoundException;
import swagger.jaxrs.PingApiService;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-08T13:37:07.945-08:00")
public class PingApiServiceImpl extends PingApiService {
    @Override
    public Response pingGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
