package com.cosmos.multifamily.service;

import com.cosmos.multifamily.domain.dto.ExperimentRequestDto;

/**
 * Created by youngman on 2018-12-19.
 */
public interface ExperimentService {

    void saveExperimentResult(ExperimentRequestDto experimentRequestDto);
}