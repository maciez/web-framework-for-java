/*******************************************************************************
 * Copyright (C) 2017 http://bndy.net
 * Created by Bendy (Bing Zhang)
 ******************************************************************************/
package net.bndy.wf.exceptions;

import net.bndy.wf.lib.annotation.*;

public enum OAuthExceptionType {

	@Description(value = "Invalid client id or redirect uri.")
	InvalidClientIDOrRedirectUri,

	@Description(value = "Invalid authorization code.")
	InvalidAuthorizationCode,

	@Description(value = "Invalid access token.")
	InvalidAccessToken,
	
	@Description(value = "Invalid user.")
	InvalidUser,
}
