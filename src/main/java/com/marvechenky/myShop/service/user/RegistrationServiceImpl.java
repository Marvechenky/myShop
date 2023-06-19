package com.marvechenky.myShop.service.user;

import com.marvechenky.myShop.data.model.User;
import com.marvechenky.myShop.data.repositories.UserRepository;
import com.marvechenky.myShop.dtos.request.RegistrationRequest;
import com.marvechenky.myShop.enums.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;




    @Override
    public String register(RegistrationRequest registrationRequest) throws Exception {
        var user = User.builder()
                .firstName(registrationRequest.getFirstName())
                .lastName(registrationRequest.getLastName())
                .email(registrationRequest.getEmail())
                .password(passwordEncoder.encode(registrationRequest.getPassword()))
                .role(UserRole.CUSTOMER)
                .build();
        userRepository.save(user);
        return "user registered successfully";
    }
}
