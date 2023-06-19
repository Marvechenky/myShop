package com.marvechenky.myShop.service.user;

import com.marvechenky.myShop.dtos.request.RegistrationRequest;

public interface RegistrationService {

    String register(RegistrationRequest registrationRequest) throws Exception;
}
