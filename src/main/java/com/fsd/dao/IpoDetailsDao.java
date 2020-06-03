package com.fsd.dao;

import com.fsd.entity.IpoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IpoDetailsDao extends JpaRepository<IpoDetails, Long> {

  IpoDetails findByCompanyName(String companyName);

  List<IpoDetails> findAllByOrderByOpenDateTimeAsc();

}
