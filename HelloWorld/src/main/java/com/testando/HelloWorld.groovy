package com.testando

import com.onresolve.scriptrunner.runner.rest.common.CustomEndpointDelegate
import javax.ws.rs.core.Response
import groovy.json.JsonBuilder
import groovy.transform.BaseScript
import javax.ws.rs.core.MultivaluedMap


@BaseScript CustomEndpointDelegate delegate

doSomething(httpMethod: "GET", groups: ["gp493"]) { MultivaluedMap queryParams, String body ->
    return Response.ok(new JsonBuilder([Test: 'hello world']).toString()).build();
}
jr