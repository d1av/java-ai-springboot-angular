package io.davi.javai.repository;

import io.davi.javai.entity.ErrorLog;
import io.davi.javai.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}
