package com.auth.full.Service;

import com.auth.full.Entity.RefreshToken;
import com.auth.full.Entity.UserInfo;
import com.auth.full.Repository.RefreshTokenRepo;
import com.auth.full.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class RefreshTokenService {

    @Autowired
    private RefreshTokenRepo refreshTokenRepo;

    @Autowired
    private UserRepository userRepository;

    public RefreshToken createRefreshToken(String userName){
        UserInfo userInfoExtracted = userRepository.findByUserName(userName);
        RefreshToken refreshToken = RefreshToken.builder()
                .userInfo(userInfoExtracted)
                .token(UUID.randomUUID().toString())
                .expiryDate(Instant.now().plusMillis(600000))
                .build();
        return refreshTokenRepo.save(refreshToken);
    }

    public RefreshToken verifyExpiration(RefreshToken token){
        if(token.getExpiryDate().compareTo(Instant.now())<0){
            refreshTokenRepo.delete(token);
            throw new RuntimeException(token.getToken() + "Error while deleting token");
        }
        return token;
    }

    public Optional<RefreshToken> findByToken(String token){
        return refreshTokenRepo.findByToken(token);
    }
}
