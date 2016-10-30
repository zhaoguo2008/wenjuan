package com.wowtour.jersey.vo;

import com.wowtour.jersey.comm.Constants;
import com.wowtour.jersey.utils.JerseyUtils;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyWebTarget;

/**
 * JerseyWebTarget EndPoints
 *
 * @author Lynch 2014-09-15
 */
public interface EndPoints {

    public final JerseyClient CLIENT = JerseyUtils.getJerseyClient(true);

    public final JerseyWebTarget ROOT_TARGET = CLIENT
            .target(Constants.API_HTTP_SCHEMA + "://"
                    + Constants.API_SERVER_HOST + "/");

    public JerseyWebTarget MANAGEMENT_TARGET = ROOT_TARGET.path("management");

    public JerseyWebTarget TOKEN_ORG_TARGET = MANAGEMENT_TARGET.path("token");

    public JerseyWebTarget APPLICATION_TEMPLATE = ROOT_TARGET
            .path("hd18701968643").path("vcbbs5");

    public JerseyWebTarget TOKEN_APP_TARGET = APPLICATION_TEMPLATE
            .path("token");

    public JerseyWebTarget USERS_TARGET = APPLICATION_TEMPLATE.path("users");

    public JerseyWebTarget USERS_ADDFRIENDS_TARGET = APPLICATION_TEMPLATE
            .path("users").path("{ownerUserPrimaryKey}").path("contacts")
            .path("users").path("{friendUserPrimaryKey}");

    public JerseyWebTarget MESSAGES_TARGET = APPLICATION_TEMPLATE
            .path("messages");

    public JerseyWebTarget CHATMESSAGES_TARGET = APPLICATION_TEMPLATE
            .path("chatmessages");

    public JerseyWebTarget CHATGROUPS_TARGET = APPLICATION_TEMPLATE
            .path("chatgroups");

    public JerseyWebTarget CHATFILES_TARGET = APPLICATION_TEMPLATE
            .path("chatfiles");

}
