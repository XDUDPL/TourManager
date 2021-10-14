//package com.example.tourmanager.Config;
//
//import com.example.tourmanager.Entity.UserEntity;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//import java.util.Optional;
//
//
//@Configuration
//@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
//public class JpaAuditingConfig {
//
//    @Bean
//    public AuditorAware<UserEntity> auditorProvider() {
//        return new AuditorAwareImpl();
//    }
//
//    public static class AuditorAwareImpl implements AuditorAware<UserEntity> {
//
//        @Override
//        public Optional<UserEntity> getCurrentAuditor() {
//
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//            if (authentication == null || !authentication.isAuthenticated()) {
//                return null;
//            }
////            return ((MyUserDetails) authentication.getPrincipal()).getUser();
//            return null;
//        }
//        }
//    }