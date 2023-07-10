package com.reihaneh.bakeryshop.repository;

import com.reihaneh.bakeryshop.domain.LoginHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginHistoryRepository extends BaseRepository<LoginHistory, Long> {
}
