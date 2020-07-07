package com.example.aoe2reactdata.service;
import java.util.Collection;

import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.aoe2reactdata.mongodao.CivilizationsDao;
import com.example.aoe2reactdata.model.Civilizations;
@Service
public class CivilizationsImplService implements CivilizationsService {
	@Autowired
	CivilizationsDao dao;
    @Override
    public Collection<Civilizations> getAllCivilizations() {
        return dao.findAll();
    }
}
