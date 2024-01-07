package io.getarrays.server.repository;

import io.getarrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.IOException;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
