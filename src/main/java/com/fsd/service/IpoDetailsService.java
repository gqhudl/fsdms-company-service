package com.fsd.service;

import com.fsd.entity.IpoDetails;

import java.util.List;

public interface IpoDetailsService {

  IpoDetails getIpoDetailsByCompanyName(String companyName);

  List<IpoDetails> getAllOrderByOpenDateTimeAsc();

  IpoDetails insertUpdateIpoDetails(IpoDetails ipoDetails);

}
