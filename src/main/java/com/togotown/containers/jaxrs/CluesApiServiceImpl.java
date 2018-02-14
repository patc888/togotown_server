package com.togotown.containers.jaxrs;

import com.togotown.Clue;
import com.togotown.TogoTown;
import com.togotown.TogoTownException;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-08T13:37:07.945-08:00")
public class CluesApiServiceImpl extends CluesApiService {
    private TogoTown togotown;

    public CluesApiServiceImpl(ServletConfig servletConfig) throws Exception {
        togotown = TogoTownService.get(servletConfig, servletConfig.getInitParameter("togotown.resourceBasename"));
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
        if (sceneId == null) {
            throw TogoTownException.badInput("sceneId parameter is missing");
        }
        List<Clue> clues = togotown.getClues(sceneId);
        List<SwClue> rsClues = clues.stream()
                .map(c -> {
                    SwClue sc = new SwClue();
                    sc.setId(c.getId());
                    sc.setSceneId(c.getSceneId());
                    sc.setLangId(c.getLangId());
                    sc.setPhraseId(c.getPhraseId());
                    sc.setParentId(c.getParentId());
                    sc.setSpotIds(c.getSpotIds());
                    sc.setActive(c.getActive());
                    sc.setReviewed(c.getReviewed());
                    return sc;
                })
                .collect(Collectors.toList());

        Map map = new HashMap();
        map.put("clues", rsClues);
        return Response.ok().entity(map).build();
    }
}
