package com.togotown.containers.jaxrs;

import com.togotown.Clue;
import swagger.jaxrs.ApiResponseMessage;
import swagger.jaxrs.CluesApiService;
import swagger.jaxrs.NotFoundException;
import swagger.jaxrs.models.SwClue;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-08T13:37:07.945-08:00")
public class CluesApiServiceImpl extends CluesApiService {
    @Context
    ServletContext context;

    @Inject
    ServletContext context2;

    public CluesApiServiceImpl(ServletConfig servletConfig) {
        System.out.println(servletConfig);
    }

    @Override
    public Response createClue(SwClue body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getClue(Integer clueId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getClues( Integer sceneId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic")).build();
    }
}
